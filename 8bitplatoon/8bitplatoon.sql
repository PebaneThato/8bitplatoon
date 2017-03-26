-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Mar 26, 2017 at 08:28 PM
-- Server version: 5.5.8
-- PHP Version: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `8bitplatoon`
--

-- --------------------------------------------------------

--
-- Table structure for table `cic`
--

CREATE TABLE IF NOT EXISTS `cic` (
  `cicid` bigint(11) NOT NULL AUTO_INCREMENT,
  `cictype` varchar(255) NOT NULL,
  `subject` varchar(255) NOT NULL,
  `body` varchar(255) NOT NULL,
  `sourcesystem` varchar(255) NOT NULL,
  `cictimestamp` datetime NOT NULL,
  `entityid` bigint(11) NOT NULL,
  PRIMARY KEY (`cicid`),
  KEY `cic_ibfk_1` (`entityid`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf32 AUTO_INCREMENT=13 ;

--
-- Dumping data for table `cic`
--


-- --------------------------------------------------------

--
-- Table structure for table `entity`
--

CREATE TABLE IF NOT EXISTS `entity` (
  `entityid` bigint(11) NOT NULL AUTO_INCREMENT,
  `entityname` varchar(100) NOT NULL,
  `emailaddress` varchar(100) NOT NULL,
  PRIMARY KEY (`entityid`),
  UNIQUE KEY `entityname` (`entityname`),
  UNIQUE KEY `emailaddress` (`emailaddress`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf32 AUTO_INCREMENT=28 ;


--
-- Constraints for table `cic`
--
ALTER TABLE `cic`
  ADD CONSTRAINT `cic_ibfk_1` FOREIGN KEY (`entityid`) REFERENCES `entity` (`entityid`);
