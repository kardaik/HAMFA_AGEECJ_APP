<?php
	/*
 * Following code will list all the products
 */
 
// array for JSON response
$response = array();
 
// include db connect class
require_once __DIR__ . '/db_connect.php';
 
// connecting to db
$db = new DB_CONNECT();
 
// get all products from products table
$result = mysql_query("SELECT *FROM event") or die(mysql_error());
 
// check for empty result
if (mysql_num_rows($result) > 0) {
    // looping through all results
    // products node
    $response["event"] = array();
 
    while ($row = mysql_fetch_array($result)) {
        // temp user array
        $product = array();
        $product["created_at"] = $row["created_at"];
        $product["updated_at"] = $row["updated_at"];
		$product["dateEvent"] = $row["dateEvent"];
		$product["eventId"] = $row["eventId"];
		$product["guideLocalEvent"] = $row["guideLocalEvent"];
		$product["heureEvent"] = $row["heureEvent"];
		$product["localEvent"] = $row["localEvent"];
		$product["nomEvent"] = $row["nomEvent"];
		$product["OrdreJourEent"] = $row["OrdreJourEent"];
		$product["point1Event"] = $row["point1Event"];
		$product["point2Event"] = $row["point2Event"];
		$product["point3Event"] = $row["point3Event"];
		$product["point4Event"] = $row["point4Event"];
		$product["point5Event"] = $row["point5Event"];
		$product["point6Event"] = $row["point6Event"];
		$product["point7Event"] = $row["point7Event"];
		$product["salutationEvent"] = $row["salutationEvent"];
 
        // push single product into final response array
        array_push($response["event"], $product);
    }
    // success
    $response["success"] = 1;
 
    // echoing JSON response
    echo json_encode($response);
} else {
    // no products found
    $response["success"] = 0;
    $response["message"] = "No event found";
 
    // echo no users JSON
    echo json_encode($response);
}
?>