<?php

$name = readline();

$names = [
    "Alice",
    "Bob",
    "Kolu"
];

// if ("Alice" == $name || "Bob" == $name) {
//     echo "HEllo, $name";
// }

if (in_array($name, $names)) {
echo "HEllo, $name";
}
