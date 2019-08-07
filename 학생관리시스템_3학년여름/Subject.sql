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
-- 테이블 구조 `Subject`
--

CREATE TABLE `Subject` (
  `subjectNum` varchar(50) NOT NULL,
  `subjectName` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 테이블의 덤프 데이터 `Subject`
--

INSERT INTO `Subject` (`subjectNum`, `subjectName`) VALUES
('001082', '마이크로컴퓨터'),
('001111', '네트워크프로그래밍'),
('001122', '데이터베이스프로그래밍'),
('001234', '멀티미디어데이터베이스'),
('001769', '소프트웨어공학'),
('002222', '인터넷보안'),
('002255', '가상현실'),
('002277', '게임프로그래밍'),
('002505', '인공지능'),
('003272', '컴파일러'),
('003281', '컴퓨터그래픽스'),
('003284', '컴퓨터네트워크'),
('003353', '통계학개론'),
('003445', '시스템모델링'),
('004118', '디지털시스템'),
('004444', '스마트그리드'),
('004599', '통신시스템'),
('004600', '디지털신호처리'),
('004699', '데이터통신'),
('005246', '신호및시스템'),
('005619', '멀티미디어프로그래밍'),
('005636', '멀티미디어'),
('005656', 'UNIX프로그래밍'),
('006132', '영상처리'),
('006135', '정보보호개론'),
('006139', '임베디드시스템'),
('006143', '디지털사운드'),
('006478', '무선통신'),
('006566', '지능형시스템'),
('006767', '정보검색'),
('007219', '데이터베이스'),
('007313', '프로그래밍언어의개념'),
('007651', '영상처리프로그래밍'),
('007777', '컴퓨터에니메이션'),
('008066', '모바일프로그래밍'),
('008636', '멀티코어프로그래밍'),
('008862', '컴퓨터비젼시스템'),
('009090', 'HCI개론'),
('009665', '패턴인식'),
('009802', 'VHDL프로그래밍'),
('009812', '분산시스템'),
('009814', '기계학습'),
('009898', '증강현실'),
('009959', '확률통계및프로그래밍'),
('009961', '선형대수및프로그래밍'),
('010142', '데이터분석'),
('010203', '고급실시간그래픽스');

--
-- 덤프된 테이블의 인덱스
--

--
-- 테이블의 인덱스 `Subject`
--
ALTER TABLE `Subject`
  ADD PRIMARY KEY (`subjectNum`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
