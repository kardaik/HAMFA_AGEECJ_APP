/*-----------------------------------------------------------------
	Android AGEECJ bd
 		
 	Script de création de la BD
	
	Nom: Fabrice Hammond
-----------------------------------------------------------------*/

PRINT('Debut du script de création de la bd')
-- -------------------------------------------------------
GO
SET nocount    ON;
SET DATEFORMAT ymd;
USE master
GO

PRINT('Création et sélection de la base de données')
-- -------------------------------------------------------
GO
	IF EXISTS(SELECT * FROM sys.databases WHERE name = 'BDAGEECJ')
	DROP DATABASE BDAGEECJ;
GO
	CREATE DATABASE BDAGEECJ ON PRIMARY
	( NAME = 'BDAGEECJ_ppal',
	FILENAME = 'C:\BD\BDAGEECJ_ppal.mdf' ,
	SIZE = 10MB , MAXSIZE = 25MB, FILEGROWTH = 1MB )
	LOG ON
	( NAME = 'BDAGEECJ_Log',
	FILENAME = 'C:\BD\BDAGEECJ_Log.ldf' ,
	SIZE = 5MB , MAXSIZE = 20MB , FILEGROWTH = 2MB )
GO
USE BDAGEECJ
SET DATEFORMAT ymd;
GO

PRINT('1 Création de la table tblEvenement')
-- -------------------------------------------------------
GO
IF OBJECT_ID('BDAGEECJ.dbo.tblEvenement') IS NOT NULL
DROP TABLE BDAGEECJ.dbo.tblEvenement
GO
CREATE TABLE tblEvenement(
	noEvenement		int			NOT NULL	IDENTITY(1, 1),
	nomEv			char		NOT NULL,
	DateEv			date		NOT NULL,
	LocalEv			char		NOT NULL,
	HeureEv			time		NOT NULL,
	GuideLocalEv	char		NOT NULL,
	DescriptEv		char		NOT NULL,
	CONSTRAINT PK_id_JoueursAfrique PRIMARY KEY(noEvenement)
)
GO

PRINT('1 Création de la table tblLogin')
-- -------------------------------------------------------
GO
IF OBJECT_ID('BDAGEECJ.dbo.tblLogin') IS NOT NULL
DROP TABLE BDAGEECJ.dbo.tblLogin
GO
CREATE TABLE tblLogin(
	UserName		int			NOT NULL,
	Mdp				char		NOT NULL,
	-- CONSTRAINT PK_id_JoueursAfrique PRIMARY KEY(noEvenement) --
)
GO