-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: equation
-- ------------------------------------------------------
-- Server version	8.0.32

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `equation`
--

DROP TABLE IF EXISTS `equation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `equation` (
  `trueEq` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `id` int NOT NULL AUTO_INCREMENT,
  `trueRoot` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=59 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `equation`
--

LOCK TABLES `equation` WRITE;
/*!40000 ALTER TABLE `equation` DISABLE KEYS */;
INSERT INTO `equation` (`trueEq`, `id`, `trueRoot`) VALUES ('20-x=10',25,NULL),('10-x=10',26,NULL),('20 *3-x= 10',27,NULL),('10-x=5',28,NULL),('10-x=5',29,NULL),('10-x=5',30,'5'),('35-x=0',31,'35'),('25-x=6',32,NULL),('10-5+x=13',33,NULL),('10-4*x=100',34,NULL),('10-x=5',35,NULL),('10-x=5',36,NULL),(' 10-x=5',37,NULL),('24-x=10',38,NULL),('10-4=x',39,NULL),('10-4+x=12',40,NULL),('10-x=3',41,NULL),('50-x=25',42,NULL),('10-x=2',43,NULL),('20-x=10',44,NULL),('25-x=20',45,'5'),('',46,NULL),('56*x-(21+8)=40',47,NULL),('15-x=2',48,'13'),('10-4*x=20',49,NULL),('1-2=4',50,NULL),('-1.3*5/x=1.2',51,NULL),('1.5+x=3',52,NULL),('х-3=1',53,NULL),('2*x-10=0',54,'5'),('-5-x=-10',55,NULL),('-5+x=5',56,NULL),('10-x=20',57,NULL),('20-x=10',58,'10');
/*!40000 ALTER TABLE `equation` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-03-29 12:23:17
