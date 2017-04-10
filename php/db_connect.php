<?php
	//a class file to connect to database
	class DB_CONNECT{
		//connector
		// constructor
		public function __construct() {
			// connecting to database
			$this->connect();
		}
		
		// destructor
		function __destruct() {
			// closing db connection
			$this->close();
		}
		
		 
		//function to connect with DB
		
		function connect(){
			//import db connection parameters
			require_once __DIR__ . '/db_config.php';
			
			//connecting to mysql db
			$con = mysql_connect(DB_SERVER, DB_USER, DB_PASSWORD) or die(mysql_error());
			
			//selecting db
			$db = mysql_select_db(DB_DATABASE) or die(mysql_error()) or die (mysql_error());
			
			// returing connection cursor
			return $con;
		}
		
		//function to close connection with db
		
		function close(){
        // closing db connection
        mysql_close();
		}
	}
?>