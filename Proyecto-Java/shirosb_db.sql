-- phpMyAdmin SQL Dump
-- version 5.1.4
-- https://www.phpmyadmin.net/
--
-- Host: mysql-shirosb.alwaysdata.net
-- Generation Time: Jun 07, 2022 at 09:23 PM
-- Server version: 10.6.5-MariaDB
-- PHP Version: 7.4.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `shirosb_db`
--
CREATE DATABASE IF NOT EXISTS `shirosb_db` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `shirosb_db`;

-- --------------------------------------------------------

--
-- Table structure for table `Pajaros`
--

CREATE TABLE `Pajaros` (
  `ID` int(11) NOT NULL,
  `Especie` varchar(255) DEFAULT NULL,
  `Genero` varchar(255) DEFAULT NULL,
  `Habitat` varchar(255) DEFAULT NULL,
  `Tiempo_Navegacion` varchar(255) DEFAULT NULL,
  `Hora_Llegada` varchar(255) DEFAULT NULL,
  `Viento` varchar(255) DEFAULT NULL,
  `Nubosidad` varchar(255) DEFAULT NULL,
  `Direccion_Viento` varchar(255) DEFAULT NULL,
  `Size` varchar(255) DEFAULT NULL,
  `Embarcaciones` varchar(255) DEFAULT NULL,
  `Parasitos` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `Peces`
--

CREATE TABLE `Peces` (
  `ID` int(11) NOT NULL,
  `Especie` varchar(255) DEFAULT NULL,
  `Genero` varchar(255) DEFAULT NULL,
  `Habitat` varchar(255) DEFAULT NULL,
  `Tiempo_Navegacion` varchar(255) DEFAULT NULL,
  `Hora_Llegada` varchar(255) DEFAULT NULL,
  `Viento` varchar(255) DEFAULT NULL,
  `Nubosidad` varchar(255) DEFAULT NULL,
  `Direccion_Viento` varchar(255) DEFAULT NULL,
  `Size` varchar(255) DEFAULT NULL,
  `Embarcaciones` varchar(255) DEFAULT NULL,
  `N_Anzuelos` varchar(255) DEFAULT NULL,
  `Profundidad` varchar(255) DEFAULT NULL,
  `T_Anzuelo` varchar(255) DEFAULT NULL,
  `P_Anzuelos` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `Tiburones`
--

CREATE TABLE `Tiburones` (
  `ID` int(11) NOT NULL,
  `Especie` varchar(255) DEFAULT NULL,
  `Genero` varchar(255) DEFAULT NULL,
  `Habitat` varchar(255) DEFAULT NULL,
  `Tiempo_Navegacion` varchar(255) DEFAULT NULL,
  `Hora_Llegada` varchar(255) DEFAULT NULL,
  `Viento` varchar(255) DEFAULT NULL,
  `Nubosidad` varchar(255) DEFAULT NULL,
  `Direccion_Viento` varchar(255) DEFAULT NULL,
  `Size` varchar(255) DEFAULT NULL,
  `Embarcaciones` varchar(255) DEFAULT NULL,
  `Heridas` varchar(255) DEFAULT NULL,
  `Profundidad` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Pajaros`
--
ALTER TABLE `Pajaros`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `Peces`
--
ALTER TABLE `Peces`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `Tiburones`
--
ALTER TABLE `Tiburones`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Pajaros`
--
ALTER TABLE `Pajaros`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Peces`
--
ALTER TABLE `Peces`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Tiburones`
--
ALTER TABLE `Tiburones`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
