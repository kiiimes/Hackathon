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
-- 테이블 구조 `Complete`
--

CREATE TABLE `Complete` (
  `studentId` int(11) NOT NULL,
  `subjectNum` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 테이블의 덤프 데이터 `Complete`
--

INSERT INTO `Complete` (`studentId`, `subjectNum`) VALUES
(16011008, '009961'),
(16011008, '005246'),
(16011008, '001234'),
(16011008, '006132'),
(16011008, '008066'),
(16011008, '004599'),
(16011008, '004118'),
(16011008, '006139'),
(16011008, '010142'),
(112067, '003284'),
(112067, '006139'),
(112067, '006478'),
(112067, '004699'),
(112067, '002222'),
(112067, '001111'),
(112067, '003353'),
(112067, '007219'),
(122089, '005619'),
(122089, '009961'),
(122089, '003281'),
(122089, '010203'),
(122089, '002255'),
(122089, '005636'),
(122089, '002277'),
(122089, '006143'),
(122089, '005246'),
(122089, '004600'),
(13010969, '003353'),
(13010969, '009959'),
(13010969, '007219'),
(13010969, '010142'),
(13010969, '009814'),
(13010969, '008862'),
(13010969, '009898'),
(13010969, '007777'),
(15010979, '004118'),
(15010979, '001082'),
(15010979, '009802'),
(15010979, '007219'),
(15010979, '007313'),
(15010979, '001769'),
(15010979, '008636'),
(15010979, '003445'),
(15010979, '009812'),
(16010946, '009959'),
(16010946, '007219'),
(16010946, '009665'),
(16010946, '002505'),
(16010946, '005636'),
(16010946, '010142'),
(16010946, '009814'),
(16010946, '005246'),
(16010946, '003284'),
(16010960, '003284'),
(16010960, '004118'),
(16010960, '003353'),
(16011007, '004118'),
(16011007, '001082'),
(16011007, '006132'),
(16011007, '002505'),
(16011016, '005636'),
(16011016, '009961'),
(16011016, '003284'),
(16011016, '005246'),
(16011016, '004118'),
(16011016, '005619'),
(16011016, '006135');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
