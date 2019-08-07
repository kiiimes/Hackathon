-- phpMyAdmin SQL Dump
-- version 4.5.4.1deb2ubuntu2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- 생성 시간: 18-06-26 14:56
-- 서버 버전: 5.7.22-0ubuntu0.16.04.1
-- PHP 버전: 7.0.30-0ubuntu0.16.04.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- 데이터베이스: `JH`
--

-- --------------------------------------------------------

--
-- 테이블 구조 `TrackSubject`
--

CREATE TABLE `TrackSubject` (
  `trackKey` int(11) NOT NULL,
  `subjectNum` varchar(50) NOT NULL,
  `flag` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 테이블의 덤프 데이터 `TrackSubject`
--

INSERT INTO `TrackSubject` (`trackKey`, `subjectNum`, `flag`) VALUES
(2, '005636', 1),
(2, '009961', 1),
(2, '003353', 1),
(2, '005246', 0),
(2, '004600', 0),
(2, '001234', 0),
(2, '009665', 0),
(2, '008862', 0),
(2, '006132', 0),
(2, '007651', 0),
(2, '008066', 0),
(3, '003284', 1),
(3, '005246', 1),
(3, '009959', 1),
(3, '004599', 0),
(3, '004600', 0),
(3, '006139', 0),
(3, '001111', 0),
(3, '006135', 0),
(3, '004699', 0),
(3, '006478', 0),
(3, '004444', 0),
(3, '002222', 0),
(4, '004118', 1),
(4, '001082', 1),
(4, '009802', 1),
(4, '007219', 0),
(4, '007313', 0),
(4, '001769', 0),
(4, '008636', 0),
(4, '003445', 0),
(4, '009812', 0),
(4, '003272', 0),
(4, '005656', 0),
(4, '006139', 0),
(5, '003353', 1),
(5, '009959', 1),
(5, '007219', 1),
(5, '006132', 0),
(5, '009665', 0),
(5, '002505', 0),
(5, '006566', 0),
(5, '005636', 0),
(5, '006767', 0),
(5, '009090', 0),
(5, '001122', 0),
(5, '010142', 0),
(5, '009814', 0),
(5, '008862', 0),
(6, '005619', 1),
(6, '009961', 1),
(6, '003281', 1),
(6, '010203', 0),
(6, '002255', 0),
(6, '005636', 0),
(6, '002277', 0),
(6, '006143', 0),
(6, '007777', 0),
(6, '009898', 0),
(6, '009090', 0);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
