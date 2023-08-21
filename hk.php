<?php

$csv = file_get_contents("hk.csv");
$csvRows = explode(PHP_EOL, $csv);
$csvRows = array_filter($csvRows);


$hotkeys = [];

foreach ($csvRows  as  $one) {
    $oneRow = explode(",", $one);

    if (empty($oneRow[1])) {
        $hotkeys []= ["action"=>$oneRow[0],"keys"=>"-", "filter"=>""];
    }else{
        $hotkeys []= [
            "action"=>$oneRow[0],
            "keys"=>$oneRow[1],
            "filter"=>$oneRow[2],
        ];
    }
}


$htmlRows = [];
foreach ($hotkeys as $one) {

    if (!empty($one["action"]) && !empty($one["keys"]) && !empty($one["filter"])) {

        $keys = $one["keys"];

        $allKeysArray = explode("|", $keys);

        $allKeysHtmlArray = [];
        foreach ($allKeysArray as  $oneComb) {
            $keysArray = explode("+", $oneComb);
            $keysHtmlArray = [];

            $keysHtml = [];
            foreach ($keysArray as $oneKey) {
                $keysHtml[]= "<kbd>{$oneKey}</kbd>";
            }

            $allKeysHtmlArray[]= implode(" + ", $keysHtml);
        }
        $allKeysHtmlString = implode(" | ",$allKeysHtmlArray);



        $htmlRowArray = [
            "<tr>",
             "<td>{$one["action"]}</td>",
             "<td>{$allKeysHtmlString}</td>",
            "</tr>"
        ];



        $htmlRows[]= implode("", $htmlRowArray);
    }
}

$table = implode(PHP_EOL, $htmlRows);

echo "<table>{$table}</table>";
