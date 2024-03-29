-- MySQL Script generated by MySQL Workbench
-- Sat Nov 16 14:22:06 2019
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema bancingappdb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `bancingappdb` ;

-- -----------------------------------------------------
-- Schema bancingappdb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `bancingappdb` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `bancingappdb` ;

-- -----------------------------------------------------
-- Table `country`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `country` ;

CREATE TABLE IF NOT EXISTS `country` (
  `idcountry` INT(11) NOT NULL AUTO_INCREMENT,
  `country` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`idcountry`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `city`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `city` ;

CREATE TABLE IF NOT EXISTS `city` (
  `idcity` INT(11) NOT NULL AUTO_INCREMENT,
  `city` VARCHAR(255) NOT NULL,
  `country_fk` INT(11) NOT NULL,
  PRIMARY KEY (`idcity`),
  UNIQUE INDEX `idcity_UNIQUE` (`idcity` ASC),
  INDEX `city_to_country_idx` (`country_fk` ASC),
  CONSTRAINT `city_to_country`
    FOREIGN KEY (`country_fk`)
    REFERENCES `country` (`idcountry`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `adress`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `adress` ;

CREATE TABLE IF NOT EXISTS `adress` (
  `idadress` INT(11) NOT NULL AUTO_INCREMENT,
  `street` VARCHAR(255) NOT NULL,
  `street_number` VARCHAR(10) NOT NULL,
  `postal_code` SMALLINT(4) NOT NULL,
  `city_fk` INT(11) NOT NULL,
  PRIMARY KEY (`idadress`),
  UNIQUE INDEX `idadress_UNIQUE` (`idadress` ASC),
  INDEX `adress_to_city_idx` (`city_fk` ASC),
  CONSTRAINT `adress_to_city`
    FOREIGN KEY (`city_fk`)
    REFERENCES `city` (`idcity`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `customer`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `customer` ;

CREATE TABLE IF NOT EXISTS `customer` (
  `idcustomer` INT(11) NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(255) NOT NULL,
  `last_name` VARCHAR(255) NOT NULL,
  `adress_fk` INT(11) NOT NULL,
  `contact_fk` INT(11) NOT NULL,
  PRIMARY KEY (`idcustomer`),
  UNIQUE INDEX `idcustomer_UNIQUE` (`idcustomer` ASC),
  INDEX `customer_to_adress_idx` (`adress_fk` ASC),
  INDEX `customer_to_contact_idx` (`contact_fk` ASC),
  CONSTRAINT `customer_to_adress`
    FOREIGN KEY (`adress_fk`)
    REFERENCES `adress` (`idadress`),
  CONSTRAINT `customer_to_contact`
    FOREIGN KEY (`contact_fk`)
    REFERENCES `contact` (`idcontact`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `contact`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `contact` ;

CREATE TABLE IF NOT EXISTS `contact` (
  `idcontact` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NULL DEFAULT NULL,
  `value` VARCHAR(255) NULL DEFAULT NULL,
  `typea` ENUM('Email', 'Phone', 'Mobile', 'Instagram', 'Twitter', 'Youtube', 'Snapchat') NULL DEFAULT NULL,
  `typeb` ENUM('Privat', 'Geschaeftlich', 'Unbekannt') NULL DEFAULT NULL,
  `customer_fk` INT(11) NOT NULL,
  PRIMARY KEY (`idcontact`),
  UNIQUE INDEX `idcontact_UNIQUE` (`idcontact` ASC),
  INDEX `contact_to_customer_idx` (`customer_fk` ASC),
  CONSTRAINT `contact_to_customer`
    FOREIGN KEY (`customer_fk`)
    REFERENCES `customer` (`idcustomer`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
