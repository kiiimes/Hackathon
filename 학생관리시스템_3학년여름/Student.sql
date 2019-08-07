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
-- 테이블 구조 `Student`
--

CREATE TABLE `Student` (
  `studentId` int(11) NOT NULL,
  `studentName` varchar(100) NOT NULL,
  `major` varchar(100) NOT NULL,
  `college` varchar(100) NOT NULL,
  `grade` int(11) NOT NULL,
  `semester` int(11) NOT NULL,
  `selectTrack` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 테이블의 덤프 데이터 `Student`
--

INSERT INTO `Student` (`studentId`, `studentName`, `major`, `college`, `grade`, `semester`, `selectTrack`) VALUES
(112067, '유정현', '컴퓨터공학과', '전자정보공학대학', 4, 7, 3),
(122089, '김효준', '컴퓨터공학과', '전자정보공학대학', 4, 7, 6),
(13010969, '이승용', '컴퓨터공학과', '소프트웨어융합대학', 4, 7, 6),
(15010979, '심재훈', '컴퓨터공학과', '소프트웨어융합대학', 4, 7, 6),
(16010946, '김은숙', '컴퓨터공학과', '소프트웨어융합대학', 3, 5, 5),
(16010960, '이수민', '컴퓨터공학과', '소프트웨어융합대학', 3, 5, NULL),
(16011007, '황서연', '컴퓨터공학과', '소프트웨어융합대학', 2, 4, 5),
(16011008, '최지현', '컴퓨터공학과', '소프트웨어융합대학', 3, 5, 2),
(16011016, '정주호', '컴퓨터공학과', '소프트웨어융학대학', 3, 5, NULL);

--
-- 덤프된 테이블의 인덱스
--

--
-- 테이블의 인덱스 `Student`
--
ALTER TABLE `Student`
  ADD PRIMARY KEY (`studentId`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
