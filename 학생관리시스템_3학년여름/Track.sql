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
-- 테이블 구조 `Track`
--

CREATE TABLE `Track` (
  `trackNum` int(11) NOT NULL,
  `trackName` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 테이블의 덤프 데이터 `Track`
--

INSERT INTO `Track` (`trackNum`, `trackName`) VALUES
(2, '멀티미디어'),
(3, '사물인터넷'),
(4, '시스템응용'),
(5, '인공지능'),
(6, '가상현실');

--
-- 덤프된 테이블의 인덱스
--

--
-- 테이블의 인덱스 `Track`
--
ALTER TABLE `Track`
  ADD PRIMARY KEY (`trackNum`);

--
-- 덤프된 테이블의 AUTO_INCREMENT
--

--
-- 테이블의 AUTO_INCREMENT `Track`
--
ALTER TABLE `Track`
  MODIFY `trackNum` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
