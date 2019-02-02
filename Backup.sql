-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3307
-- Tiempo de generación: 29-07-2018 a las 18:17:45
-- Versión del servidor: 10.2.8-MariaDB
-- Versión de PHP: 5.6.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `segurosocialuniversitario`
--
CREATE DATABASE IF NOT EXISTS `segurosocialuniversitario` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `segurosocialuniversitario`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `agenda`
--

DROP TABLE IF EXISTS `agenda`;
CREATE TABLE IF NOT EXISTS `agenda` (
  `ID_Agenda` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `ID_Beneficiario` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `Fecha_Agendada` date NOT NULL,
  `Numero_Consulta` int(11) NOT NULL,
  `ID_Medico` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `Turno` varchar(3) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`ID_Agenda`),
  KEY `ID_Beneficiario` (`ID_Beneficiario`),
  KEY `ID_Medico` (`ID_Medico`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `agenda`
--

INSERT INTO `agenda` (`ID_Agenda`, `ID_Beneficiario`, `Fecha_Agendada`, `Numero_Consulta`, `ID_Medico`, `Turno`) VALUES
('123456789qwertyuiop', '43003', '2018-03-21', 0, '649', '28'),
('123456789asdfghjkl', '41274', '2018-03-21', 0, '12345', '29'),
('qazwsxedc123456789', '42321', '2018-04-16', 0, '12345', '32'),
('edcrfvtgb23456789', '41274', '2018-04-15', 0, '649', '27'),
('741852963', '42321', '2018-04-17', 0, '741', '1'),
('147258369', '47896', '2018-04-17', 0, '741', '9'),
('95324875', '43003', '2018-04-18', 1, '741', '10'),
('854262', '42321', '2018-04-22', 0, '741', '26'),
('9654721', '41274', '2018-04-22', 0, '741', '25'),
('36221222', '47896', '2018-04-23', 0, '741', '44'),
('963245781', '41274', '2018-04-23', 0, '741', '43'),
('32521', '84576', '2018-04-24', 0, '741', '24'),
('753243', '42321', '2018-05-02', 0, '741', '24'),
('375432', '47896', '2018-05-01', 0, '741', '27'),
('2018-05-07 00:37:43.535', '47896', '2018-05-07', 0, '741', '0'),
('2018-05-07 10:15:57.556', '47896', '2018-05-09', 0, '741', '0'),
('2018-05-07 10:33:14.931', '47896', '2018-05-30', 0, '741', '0'),
('2018-05-07 11:48:39.763', '47896', '2018-05-17', 0, '741', '0'),
('2018-05-08 10:51:49.709', '42321', '2018-05-08', 0, '741', '32'),
('2018-05-07 - 22:44:32.212', '41274', '2018-05-10', 0, '649', '25'),
('2018-05-07 - 22:44:33.212', '42321', '2018-05-10', 0, '649', '26'),
('2018-05-07 - 22:45:33.212', '42321', '2018-05-11', 0, '649', '26'),
('2018-05-07 - 22:44:43.212', '47896', '2018-05-10', 0, '649', '27'),
('2018-05-07 - 22:44:23.212', '43003', '2018-05-10', 0, '649', '28'),
('2018-05-10 15:27:31.738', '41274', '2018-05-18', 0, '649', '10'),
('2018-05-11 15:47:53.808', '41274', '2018-05-11', 0, '649', '6'),
('2018-05-11 17:44:32.692', '47896', '2018-05-11', 0, '741', '28'),
('2018-05-11 17:45:05.638', '42321', '2018-05-11', 0, '741', '29'),
('2018-05-11 17:46:12.737', '84576', '2018-05-11', 0, '741', '30'),
('2018-05-11 17:46:37.123', '41274', '2018-05-11', 0, '741', '32'),
('2018-05-11 18:22:46.676', '41274', '2018-05-16', 0, '649', '4'),
('6325412577', '43003', '2018-05-18', 1, '649', '19'),
('2018-05-25 11:08:52.172', '41274', '2018-05-25', 0, '649', '4'),
('2018-05-25 11:09:10.532', '41274', '2018-05-28', 0, '649', '4'),
('2018-05-25 11:09:28.652', '42321', '2018-05-25', 0, '649', '5'),
('2018-05-25 11:09:40.385', '42321', '2018-05-27', 0, '649', '5'),
('2018-05-25 11:09:57.6', '47896', '2018-05-25', 0, '649', '6'),
('2018-05-25 11:10:17.353', '43003', '2018-05-25', 0, '649', '8'),
('2018-05-25 11:10:24.696', '43003', '2018-05-27', 0, '649', '8'),
('1527805159', '43003', '2018-05-23', 0, '12345', '19'),
('2018-06-19 23:17:42.577', '47896', '2018-06-19', 0, '741', '28'),
('2018-06-19 23:17:57.502', '42321', '2018-06-19', 0, '741', '29'),
('2018-06-19 23:18:13.872', '84576', '2018-06-19', 0, '741', '32'),
('2018-06-19 23:18:31.326', '41274', '2018-06-19', 0, '741', '33'),
('46554', '1', '2018-07-05', 1, 'med100', '0'),
('46555', '2', '2018-07-05', 0, 'med100', '1'),
('46556', '3', '2018-07-05', 0, 'med100', '2'),
('46557', '4', '2018-07-05', 0, 'med100', '3'),
('46558', '5', '2018-07-05', 0, 'med100', '4'),
('46564', '6', '2018-07-06', 0, 'med100', '0'),
('46565', '7', '2018-07-06', 0, 'med100', '1'),
('46566', '8', '2018-07-06', 0, 'med100', '2'),
('46567', '9', '2018-07-06', 0, 'med100', '3'),
('46568', '10', '2018-07-06', 0, 'med100', '4'),
('46574', '6', '2018-07-09', 0, 'med100', '0'),
('46575', '7', '2018-07-09', 0, 'med100', '1'),
('46576', '8', '2018-07-09', 0, 'med100', '2'),
('46577', '9', '2018-07-09', 1, 'med100', '3'),
('46578', '10', '2018-07-09', 1, 'med100', '4'),
('2018-07-08 17:12:56.053', '6', '2018-07-09', 0, 'med100', '1'),
('2018-07-08 17:13:28.891', '6', '2018-07-16', 0, 'med100', '1'),
('2018-07-08 17:23:52.239', '10', '2018-07-16', 0, 'med100', '5'),
('2018-07-08 17:27:21.481', '8', '2018-07-10', 0, 'med100', '6');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `beneficiarios`
--

DROP TABLE IF EXISTS `beneficiarios`;
CREATE TABLE IF NOT EXISTS `beneficiarios` (
  `ID_Beneficiario` int(11) NOT NULL,
  `Ciudad` varchar(50) NOT NULL,
  `Correo_Habitual` varchar(50) NOT NULL,
  `Direccion` varchar(100) NOT NULL,
  `Fecha_Afiliacion` date NOT NULL,
  `Fecha_Nacimiento` date NOT NULL,
  `Genero` char(1) NOT NULL,
  `Ocupacion` varchar(50) DEFAULT NULL,
  `Primer_Apellido` varchar(30) NOT NULL,
  `Primer_Nombre` varchar(30) NOT NULL,
  `Segundo_Apellido` varchar(20) NOT NULL,
  `Segundo_Nombre` varchar(20) NOT NULL,
  `Telefono_Movil` int(11) DEFAULT NULL,
  `Telefono_Celuar` int(11) DEFAULT NULL,
  `Tercer_Nombre` varchar(20) DEFAULT NULL,
  `Tipo_Benefiiciario` varchar(40) NOT NULL,
  `Tipo_De_Sangre` varchar(10) NOT NULL,
  PRIMARY KEY (`ID_Beneficiario`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `beneficiarios`
--

INSERT INTO `beneficiarios` (`ID_Beneficiario`, `Ciudad`, `Correo_Habitual`, `Direccion`, `Fecha_Afiliacion`, `Fecha_Nacimiento`, `Genero`, `Ocupacion`, `Primer_Apellido`, `Primer_Nombre`, `Segundo_Apellido`, `Segundo_Nombre`, `Telefono_Movil`, `Telefono_Celuar`, `Tercer_Nombre`, `Tipo_Benefiiciario`, `Tipo_De_Sangre`) VALUES
(41274, 'La Paz', '', 'Av. Garcia Lanza, Achumani calle 16 #1234', '2018-03-07', '1994-03-12', 'M', NULL, 'Villegas', 'Eduardo', 'Morales', 'Martin', NULL, NULL, NULL, 'Titular', 'AB+'),
(42321, 'La Paz', '', 'Av Landaeta #4215', '2018-03-05', '1997-05-12', 'F', NULL, 'Aliaga', 'Valeria', 'Taborga', 'Ericka', NULL, NULL, NULL, 'Titular', 'AO-'),
(47896, 'La Paz', '', 'Av. Innofuentes. #44', '2018-03-02', '1998-02-15', 'M', NULL, 'Cortez', 'Manuel', 'Roca', 'Juan', NULL, NULL, NULL, 'Dependiente', 'B+'),
(43003, 'La Paz', '', 'Av. 14 de Septiembre ca#200lle B ', '2018-03-12', '1999-03-22', 'F', NULL, 'Ando', 'Priscila', 'Aviles', 'Toshico', NULL, NULL, NULL, 'Titular', 'O+'),
(45889, 'La Paz', '', 'Calacoto, calle 8 #250', '2017-03-12', '1999-02-12', 'F', NULL, 'Salinas', 'Belen', 'Astorga', 'Vania', NULL, NULL, NULL, 'Titular', 'B+'),
(84576, 'La Paz', '', 'Los pinos, calle 4 #50', '2018-03-05', '1998-10-10', 'F', NULL, 'Saavedra', 'Belen', 'Vildozo', 'Nicole', NULL, NULL, NULL, 'Titular', 'O+'),
(45621, 'La Paz', '', 'Sopocachi, #500', '2017-02-13', '1998-09-13', 'M', NULL, 'Guzman', 'Christian', 'Mercado', 'Favian', NULL, NULL, NULL, 'Titular', 'o+'),
(65754, 'La Paz', 'eremiacortez@gmail.com', 'Av. Innofuentes #44', '2018-03-02', '1965-07-07', 'M', 'Docencia universitaria', 'Cortez', 'Jeremias', 'Olave', 'Pedro', 74156789, 2772524, NULL, 'Titular', 'AO-'),
(1, 'La Paz', 'Av. Ballivian calle 15 #775', 'ricardo_gareca@gmail.com', '2013-06-06', '1971-02-12', 'M', 'Docente', 'Gareca', 'Ricardo', 'Fernandez', 'Pedro', NULL, NULL, NULL, 'Titular', 'ABrh+'),
(11, 'La Paz', 'Irpavi, calle 1 #1035', 'martin_lagoon@outlook.com', '2012-12-23', '1997-04-10', 'M', 'Ing en Si', 'Laguna', 'Martin', 'Jordan', 'Roberto', NULL, NULL, NULL, 'Titular', 'BOrh-'),
(3, 'Santa Cruz', '3er anillo #280', 'belen_sag@hotmail.com', '2011-03-31', '1998-09-09', 'F', 'Asistente de vuelo', 'Saavedra', 'Belen', 'Guzman', 'Nicole', NULL, NULL, NULL, 'Titular', 'AOrh+'),
(4, 'La paz', 'Sopocachi, final Kantutani #202', 'chris.vildoc@gmail.com', '2016-12-31', '1998-09-13', 'M', 'Economista', 'Vildozo', 'Christian', 'Choque', 'Fabian', NULL, NULL, NULL, 'Titular', 'Orh+'),
(5, 'La paz', 'Miraflores, Saveedra esq Villalobos', 'manu_cortez@gmail.com', '2015-05-28', '1997-09-12', 'M', 'Diseñador', 'Cortez', 'Manuel', 'Neira', 'Alejandro', NULL, NULL, NULL, 'Titular', 'Orh+'),
(6, 'Sucre', 'Sopocachi, a dos cuadras de la plaza Avaroa', 'juan.g@gmail.com', '2014-07-13', '1998-01-13', 'M', 'Ing. Civil', 'Galindo', 'Juan', 'Ballivian', 'Alejandro', NULL, NULL, NULL, 'Titular', 'BOrh+'),
(7, 'La Paz', 'Tejada Sorzano esq Diego de Peralta #666', 'adristinamon@gmail.com', '2008-08-11', '1990-06-18', 'F', 'Sociologa', 'Mondaca', 'Adriana', 'Aviles', 'Alejandra', NULL, NULL, NULL, 'Titular', 'BOrh+'),
(8, 'La Paz', 'Calacoto, calle 8 esq av costanera', 'pato.ando777@hotmail.com', '2018-05-01', '1995-03-30', 'M', 'Administrador', 'Ando', 'Andres', 'Aviles', 'Yoichi', NULL, NULL, NULL, 'Titular', 'Orh+'),
(2, 'La Paz', 'princesa.belen@gmail.com', 'Obrajes calle 14 #200', '2011-05-06', '1999-02-12', 'F', 'Estudiante', 'Salinas', 'Vania', 'Astorga', 'Belen', NULL, NULL, NULL, 'Titular', 'BOrh+'),
(9, 'La Paz', 'william_Torrez@hotmail.com', 'Calle 1 de Obrajes, al lado de la clínica de la banca privada', '2010-11-08', '1999-01-10', 'M', 'Biologo', 'Torrez', 'William', 'Calderon', 'Eduardo', NULL, NULL, NULL, 'Titular', 'ABOrh-'),
(10, 'Cochabamba', 'daniela_santacruz@gmail.com', 'Heroinas y Antezana #508', '2011-04-20', '1998-06-10', 'F', 'Ing. Electrónica', 'Santa Cruz', 'Daniela', 'Espinoza', 'Luz', NULL, NULL, NULL, 'Titular', 'ABrh+');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `beneficiarios_dependientes`
--

DROP TABLE IF EXISTS `beneficiarios_dependientes`;
CREATE TABLE IF NOT EXISTS `beneficiarios_dependientes` (
  `ID_Beneficiario` int(11) NOT NULL,
  `Ciudad` varchar(50) NOT NULL,
  `Correo_Habitual` varchar(50) NOT NULL,
  `Direccion` varchar(100) NOT NULL,
  `Fecha_Afiliacion` date NOT NULL,
  `Fecha_Nacimiento` date NOT NULL,
  `Genero` char(1) NOT NULL,
  `Ocupacion` varchar(50) DEFAULT NULL,
  `Primer_Apellido` varchar(30) NOT NULL,
  `Primer_Nombre` varchar(30) NOT NULL,
  `Segundo_Apellido` varchar(20) NOT NULL,
  `Segundo_Nombre` varchar(20) NOT NULL,
  `Telefono_Movil` int(11) DEFAULT NULL,
  `Telefono_Celuar` int(11) DEFAULT NULL,
  `Tercer_Nombre` varchar(20) DEFAULT NULL,
  `Tipo_Benefiiciario` varchar(40) NOT NULL,
  `Tipo_De_Sangre` varchar(10) NOT NULL,
  `ID_Beneficiario_Titular` varchar(50) NOT NULL,
  PRIMARY KEY (`ID_Beneficiario`),
  KEY `ID_Beneficiario_Titular` (`ID_Beneficiario_Titular`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `beneficiarios_dependientes`
--

INSERT INTO `beneficiarios_dependientes` (`ID_Beneficiario`, `Ciudad`, `Correo_Habitual`, `Direccion`, `Fecha_Afiliacion`, `Fecha_Nacimiento`, `Genero`, `Ocupacion`, `Primer_Apellido`, `Primer_Nombre`, `Segundo_Apellido`, `Segundo_Nombre`, `Telefono_Movil`, `Telefono_Celuar`, `Tercer_Nombre`, `Tipo_Benefiiciario`, `Tipo_De_Sangre`, `ID_Beneficiario_Titular`) VALUES
(47896, 'La Paz', '', 'Av. Innofuentes #44', '2018-03-02', '1998-02-15', 'M', NULL, 'Cortez', 'Manuel', 'Roca', 'Juan', NULL, NULL, NULL, 'Dependiente', 'B+', '65754');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria_examen`
--

DROP TABLE IF EXISTS `categoria_examen`;
CREATE TABLE IF NOT EXISTS `categoria_examen` (
  `ID_Categoria_examen` varchar(50) NOT NULL,
  `Detalle` varchar(50) NOT NULL,
  PRIMARY KEY (`ID_Categoria_examen`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `categoria_examen`
--

INSERT INTO `categoria_examen` (`ID_Categoria_examen`, `Detalle`) VALUES
('cat001', 'Hematolgoia'),
('cat002', 'Qimica Sanguinea'),
('cat003', 'bactereologia');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cie`
--

DROP TABLE IF EXISTS `cie`;
CREATE TABLE IF NOT EXISTS `cie` (
  `COD_3` varchar(5) NOT NULL,
  `Descripcion_3` varchar(100) NOT NULL,
  `COD_4` varchar(4) DEFAULT NULL,
  `Descripcion_4` varchar(120) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cie`
--

INSERT INTO `cie` (`COD_3`, `Descripcion_3`, `COD_4`, `Descripcion_4`) VALUES
('A00', 'COLERA', 'A000', 'COLERA DEBIDO A VIBRIO CHOLERAE O1'),
('A00', 'COLERA', 'A001', 'COLERA DEBIDO A VIBRIO CHOLERAE O1'),
('A00', 'COLERA', 'A009', 'COLERA NO ESPECIFICADO'),
('A01', 'FIEBRES TIFOIDEA Y PARATIFOIDEA', 'A010', 'FIEBRE TIFOIDEA'),
('A01', 'FIEBRES TIFOIDEA Y PARATIFOIDEA', 'A011', 'FIEBRE PARATIFOIDEA A'),
('A01', 'FIEBRES TIFOIDEA Y PARATIFOIDEA', 'A012', 'FIEBRE PARATIFOIDEA B'),
('A01', 'FIEBRES TIFOIDEA Y PARATIFOIDEA', 'A013', 'FIEBRE PARATIFOIDEA C'),
('A01', 'FIEBRES TIFOIDEA Y PARATIFOIDEA', 'A014', 'FIEBRE PARATIFOIDEA'),
('A02', 'OTRAS INFECCIONES DEBIDAS SALMONELLA', 'A020', 'ENTERITIS DEBIDA A SALMONELLA');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `consultorios`
--

DROP TABLE IF EXISTS `consultorios`;
CREATE TABLE IF NOT EXISTS `consultorios` (
  `ID_Oficina` varchar(50) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `CODIGO` varchar(50) NOT NULL,
  `Piso` int(11) NOT NULL,
  PRIMARY KEY (`ID_Oficina`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `consultorios`
--

INSERT INTO `consultorios` (`ID_Oficina`, `Nombre`, `CODIGO`, `Piso`) VALUES
('MEOF-14', 'Oficina 14', 'MEOF-14', 3),
('MEOF-13', 'Oficina 13', 'MEOF-13', 4),
('MEOF-12', 'Oficina 12', 'MEOF-12', 3),
('MEOF-11', 'Oficina 11', 'MEOF-11', 3),
('MEOF-10', 'Oficina 10', 'MEOF-10', 3),
('MEOF-9', 'Oficina 9', 'MEOF-9', 3),
('MEOF-8', 'Oficina 8', 'MEOF-8', 5),
('MEOF-7', 'Oficina 7', 'MEOF-7', 5),
('MEOF-6', 'Oficina 6', 'MEOF-6', 5),
('MEOF-5', 'Oficina 5', 'MEOF-5', 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_examenes_laboratorio`
--

DROP TABLE IF EXISTS `detalle_examenes_laboratorio`;
CREATE TABLE IF NOT EXISTS `detalle_examenes_laboratorio` (
  `ID_Orden_Laboratorio` varchar(50) NOT NULL,
  `ID_Estudio_Examen` varchar(50) NOT NULL,
  `Resultado_Examen` varchar(50) NOT NULL,
  KEY `ID_Orden_Laboratorio` (`ID_Orden_Laboratorio`),
  KEY `ID_Estudio_Examen` (`ID_Estudio_Examen`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `detalle_examenes_laboratorio`
--

INSERT INTO `detalle_examenes_laboratorio` (`ID_Orden_Laboratorio`, `ID_Estudio_Examen`, `Resultado_Examen`) VALUES
('2018-05-08 10:56:45.578', 'est008', ''),
('2018-05-08 10:56:45.578', 'est009', ''),
('2018-05-09 12:35:17.627', 'est003', ''),
('2018-05-09 12:35:17.627', 'est006', ''),
('2018-05-09 12:35:17.627', 'est007', ''),
('2018-05-09 12:35:17.627', 'est001', ''),
('2018-05-09 12:37:29.07', 'est002', ''),
('2018-05-09 12:37:29.07', 'est003', ''),
('2018-05-09 12:37:29.07', 'est004', ''),
('2018-05-09 12:37:29.07', 'est005', ''),
('2018-05-09 12:37:29.07', 'est006', ''),
('2018-05-10 15:21:03.761', 'est001', ''),
('2018-05-10 15:21:03.761', 'est002', ''),
('2018-05-10 15:21:03.761', 'est003', ''),
('2018-05-11 15:58:07.751', 'est002', ''),
('2018-05-11 18:16:01.002', 'est006', ''),
('2018-05-11 18:16:01.002', 'est007', ''),
('2018-07-05 18:11:50.38', 'est002', ''),
('2018-07-05 18:11:50.38', 'est003', ''),
('2018-07-05 18:15:16.68', 'est003', ''),
('2018-07-05 18:15:16.68', 'est002', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_receta`
--

DROP TABLE IF EXISTS `detalle_receta`;
CREATE TABLE IF NOT EXISTS `detalle_receta` (
  `ID_Receta` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `ID_Medicamento` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `Cantidad` int(11) NOT NULL,
  `Dosificacion` int(11) NOT NULL,
  `Indicaciones` varchar(100) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `detalle_receta`
--

INSERT INTO `detalle_receta` (`ID_Receta`, `ID_Medicamento`, `Cantidad`, `Dosificacion`, `Indicaciones`) VALUES
('2018-05-08 15:41:49.38', '5184', 6, 8, 'Via Oral'),
('2018-05-08 15:41:49.38', '5894', 4, 1, 'Via Oral'),
('2018-05-08 15:50:29.218', '1985', 7, 1, 'Tomar una cada dia'),
('2018-05-08 15:50:29.218', '5894', 5, 2, 'Inyectarse una por dia'),
('2018-05-09 11:30:11.915', '3548', 5, 1, 'Tomar una cada 8 horas\n'),
('2018-05-09 11:30:11.915', '5891', 4, 1, 'Una pastilla'),
('2018-05-09 11:36:41.613', '1985', 4, 2, 'Tomar dos pastillas cada 8 horas'),
('2018-05-09 12:22:01.486', '5745', 12, 1, 'Tomar una cada 8  horas por 4 dias'),
('2018-05-09 12:22:01.486', '1285', 3, 1, 'Una por dia'),
('2018-05-09 12:38:08.168', '5184', 12, 1, 'Tomar una cada 8 horas	'),
('2018-05-10 15:21:49.892', '1335', 6, 1, 'Tomar cada 12 horas'),
('2018-05-10 15:21:49.892', '1285', 5, 1, 'Tomar cada dia una tableta'),
('2018-05-10 15:31:03.615', '4859', 6, 2, 'Tomar dos pastillas cada 8 horas'),
('2018-05-11 18:19:28.318', '3548', 9, 1, 'Tomar una tableta cada 8 horas'),
('2018-07-05 18:13:02.584', '5497', 8, 1, 'Tomar uno cada 8 horas'),
('2018-07-05 18:13:02.584', '5892', 2, 1, 'Tomar una cada Dia'),
('2018-07-05 18:15:49.544', '5184', 9, 1, 'Tomar una cada 8 horas');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `diagnosticos`
--

DROP TABLE IF EXISTS `diagnosticos`;
CREATE TABLE IF NOT EXISTS `diagnosticos` (
  `ID_Diagnostico` varchar(50) NOT NULL,
  `Analitico` varchar(200) NOT NULL,
  `Fecha_De_Consulta` date NOT NULL,
  `ID_Beneficiario` varchar(50) NOT NULL,
  `ID_Medico` varchar(50) NOT NULL,
  `Objetivo` varchar(500) NOT NULL,
  `Plan` varchar(1000) NOT NULL,
  `Subjetivo` varchar(500) NOT NULL,
  PRIMARY KEY (`ID_Diagnostico`),
  KEY `ID_Beneficiario` (`ID_Beneficiario`),
  KEY `ID_Medico` (`ID_Medico`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `emergencias`
--

DROP TABLE IF EXISTS `emergencias`;
CREATE TABLE IF NOT EXISTS `emergencias` (
  `ID_Emergencia` int(11) NOT NULL,
  `ID_Beneficiario` varchar(50) NOT NULL,
  `Localizacion` varchar(50) NOT NULL,
  `Fecha_Emergencia` date NOT NULL,
  PRIMARY KEY (`ID_Emergencia`),
  KEY `ID_Beneficiario` (`ID_Beneficiario`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estudio_examen`
--

DROP TABLE IF EXISTS `estudio_examen`;
CREATE TABLE IF NOT EXISTS `estudio_examen` (
  `ID_Estudio_Examen` varchar(50) NOT NULL,
  `ID_Categoria_examen` varchar(50) NOT NULL,
  `Detalle` varchar(80) NOT NULL,
  PRIMARY KEY (`ID_Estudio_Examen`),
  KEY `ID_Categoria_examen` (`ID_Categoria_examen`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `estudio_examen`
--

INSERT INTO `estudio_examen` (`ID_Estudio_Examen`, `ID_Categoria_examen`, `Detalle`) VALUES
('est001', 'cat001', 'Hematocrito'),
('est002', 'cat001', 'Hemoglobina'),
('est003', 'cat001', 'Globulos Rojos'),
('est004', 'cat001', 'Plaquetas'),
('est005', 'cat002', 'Glicemia'),
('est006', 'cat002', 'Globulina'),
('est007', 'cat002', 'Calcio'),
('est008', 'cat003', 'Rotabirus'),
('est009', 'cat003', 'Coproparasitologico');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historial_clinico`
--

DROP TABLE IF EXISTS `historial_clinico`;
CREATE TABLE IF NOT EXISTS `historial_clinico` (
  `ID_HC` varchar(50) NOT NULL,
  `ID_Beneficiario` varchar(50) NOT NULL,
  `ID_Agenda` varchar(50) DEFAULT NULL,
  `ID_Diagnostico` varchar(50) DEFAULT NULL,
  `ID_Receta` varchar(50) DEFAULT NULL,
  `ID_Orden_Laboratorio` varchar(50) DEFAULT NULL,
  `ID_Signos_Vitales` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID_HC`),
  KEY `ID_Beneficiario` (`ID_Beneficiario`),
  KEY `ID_Diagnostico` (`ID_Diagnostico`),
  KEY `ID_Orden_Laboratorio` (`ID_Orden_Laboratorio`),
  KEY `ID_Agenda` (`ID_Agenda`),
  KEY `ID_Signos_Vitales` (`ID_Signos_Vitales`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `indice_de_enfermedades`
--

DROP TABLE IF EXISTS `indice_de_enfermedades`;
CREATE TABLE IF NOT EXISTS `indice_de_enfermedades` (
  `ID_Beneficiario` varchar(50) NOT NULL,
  `Enfermedad` varchar(100) NOT NULL,
  `Fecha_Registrada` date NOT NULL,
  KEY `ID_Beneficiario` (`ID_Beneficiario`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `laboratorios`
--

DROP TABLE IF EXISTS `laboratorios`;
CREATE TABLE IF NOT EXISTS `laboratorios` (
  `ID_Laboratorio` varchar(50) NOT NULL,
  `Codigo_de_Laboratorio` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID_Laboratorio`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `laboratorios`
--

INSERT INTO `laboratorios` (`ID_Laboratorio`, `Codigo_de_Laboratorio`) VALUES
('L1', 'LAB1'),
('L2', 'LAB2');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `medicamentos`
--

DROP TABLE IF EXISTS `medicamentos`;
CREATE TABLE IF NOT EXISTS `medicamentos` (
  `ID_Medicamento` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `Codigo` varchar(30) NOT NULL,
  `Producto` varchar(50) NOT NULL,
  `Forma_Fisica` varchar(50) NOT NULL,
  `Cantidad` int(11) DEFAULT NULL,
  `Forma_Administracion` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID_Medicamento`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `medicamentos`
--

INSERT INTO `medicamentos` (`ID_Medicamento`, `Codigo`, `Producto`, `Forma_Fisica`, `Cantidad`, `Forma_Administracion`) VALUES
('8456', 'U4556', 'BENCILPENICILINA G CRISTALINA', 'INYECCION', 40000, 'VIAL'),
('1336', 'P0602', 'ACETAZOLAMIDA', 'Tableta', 250, 'Via Oral'),
('5184', 'R0201', 'AMOXICILINA', 'FRASCO', 120, 'Via Oral'),
('1335', 'R0602', 'CLORFENAMINA 4KG', 'Tableta', 500, 'Via Oral'),
('1285', 'G3254', 'AMPICILINA', 'POLVO ESTERIL', 100, 'Via Oral'),
('3679', 'D5894', 'CEFAZOLINA', 'POLVO ESTERIL', 133, 'VIAL'),
('4859', 'K8739', 'ERITROMICINA ERILSUCCINATO', 'SUSPENSION', 2505, 'Suspension oral'),
('2498', 'S4586', 'AZITROMICINA DIHIDRATO', 'CAPSULA O TABLETA', 500, 'Oral'),
('1985', 'L4568', 'CLINDAMICINA', 'CAPSULA', 300, 'Oral'),
('1543', 'K4056', 'DOXICICLINA HICLATO', 'CAPSULA', 100, 'Oral'),
('5497', 'V9563', 'AMOXICILINA 250mg', 'SUSPENSION', 120, 'ORAL'),
('3548', 'K9631', 'AMOXICILINA 500mg', 'CAPSULA', 500, 'ORAL'),
('2856', 'H4561', 'AMOXICILINA 850mg', 'TABLETA', 875, 'ORAL'),
('5745', 'J1461', 'ERITROMICINA', 'TABLETA RANURADA', 500, 'ORAL'),
('3520', 'U1161', 'ERITROMICINA', 'POLVO ESTERIL', 1, 'IV'),
('5891', 'G8861', 'TRIMETOPRIM', 'SUSPENSION', 200, 'ORAL'),
('5892', 'G8863', 'TRIMETOPRIM', 'TABLETA', 400, 'ORAL'),
('5893', 'G8851', 'TRIMETOPRIM', 'TABLETA', 800, 'ORAL'),
('5894', 'G8871', 'TRIMETOPRIM', 'SOLUCION', 80, 'IV');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `medicos`
--

DROP TABLE IF EXISTS `medicos`;
CREATE TABLE IF NOT EXISTS `medicos` (
  `ID_Medico` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `Primer_Apellido` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `Segundo_Apellido` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `Ciudad` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `ID_Oficina` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `Correo_Institucional` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `Direccion` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `Especialidad` varchar(50) NOT NULL,
  `Fecha_Nacimiento` date NOT NULL,
  `Horario_Inicio` varchar(10) NOT NULL,
  `Horario_Salida` varchar(10) NOT NULL,
  `Primer_Nombre` varchar(20) NOT NULL,
  `Segundo_Nombre` varchar(20) DEFAULT NULL,
  `Genero` char(1) NOT NULL,
  `Telefono_Movil` int(7) DEFAULT NULL,
  `Telefono_Oficina` int(11) DEFAULT NULL,
  `Correo_Diario` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID_Medico`),
  KEY `ID_Oficina` (`ID_Oficina`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `medicos`
--

INSERT INTO `medicos` (`ID_Medico`, `Primer_Apellido`, `Segundo_Apellido`, `Ciudad`, `ID_Oficina`, `Correo_Institucional`, `Direccion`, `Especialidad`, `Fecha_Nacimiento`, `Horario_Inicio`, `Horario_Salida`, `Primer_Nombre`, `Segundo_Nombre`, `Genero`, `Telefono_Movil`, `Telefono_Oficina`, `Correo_Diario`) VALUES
('12345', 'Zambrana', 'Rosales', 'La Paz', 'MEOF-13', 'maria.zambrana@ssu.lp.org', 'Av. Inchauste #576', 'Medicina Familiar', '1998-03-15', '16:00', '19:00', 'Maria', 'Elena', 'F', 0, NULL, NULL),
('649', 'Espinoza', 'Garcia', 'La Paz', 'MEOF-15', 'rosarioespinoza@ssu.lp', 'Av Landaeta, esquina Aspiazu #554', 'Medicina Familiar', '1987-07-22', '9:00', '12:00', 'Rosario', 'Lurdes', 'F', 0, NULL, NULL),
('741', 'Perez', 'Aviles', 'La Paz', 'MEOF-14', 'jorgeperez@ssu.lp.org', 'Avenida Inchauste #24', 'Medicina Familiar', '1988-04-18', '15:00', '18:00', 'Jorge', 'Pedro', 'M', 0, NULL, NULL),
('med100', 'Gonzales', 'Cardenas', 'La Paz', 'MEOF-14', 'patricio.gonzales@ssulp.com', 'Av. Retamas calle 3 #454', 'Medicina General', '1963-06-11', '8:00', '11:00', 'Patricio', 'Oscar', 'M', 70677745, 2114141, 'patrigon@gmail.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `orden_laboratorio`
--

DROP TABLE IF EXISTS `orden_laboratorio`;
CREATE TABLE IF NOT EXISTS `orden_laboratorio` (
  `ID_Orden_Laboratorio` varchar(50) NOT NULL,
  `ID_Beneficiario` varchar(50) NOT NULL,
  `ID_Laboratorio` varchar(50) NOT NULL,
  `Detalle` varchar(100) NOT NULL,
  `Fecha_Agendada` date NOT NULL,
  PRIMARY KEY (`ID_Orden_Laboratorio`),
  KEY `ID_Beneficiario` (`ID_Beneficiario`),
  KEY `ID_Laboratorio` (`ID_Laboratorio`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `orden_laboratorio`
--

INSERT INTO `orden_laboratorio` (`ID_Orden_Laboratorio`, `ID_Beneficiario`, `ID_Laboratorio`, `Detalle`, `Fecha_Agendada`) VALUES
('2018-05-08 10:52:45.024', '42321', 'L1', 'Examenes para el paciente y verificar posible hepatitis de top A', '2018-05-08'),
('2018-05-08 10:56:45.578', '42321', 'L1', 'Verificar si la paciente posee gastrtis tipo B', '2018-05-08'),
('2018-05-09 12:35:17.627', '47896', 'L1', 'Paciente con posible diagnostico de VIH', '2018-05-09'),
('2018-05-09 12:37:29.07', '47896', 'L1', 'Marco nivel bajo por hemorragias, verificar detalle de sangre', '2018-05-09'),
('2018-05-10 15:21:03.761', '43003', 'L1', 'Ver niveles de sangre para diagnostivco final', '2018-05-10'),
('2018-05-11 15:58:07.751', '43003', 'L1', '', '2018-05-11'),
('2018-05-11 18:16:01.002', '41274', 'L1', 'Presentar resultados para la siguiente consulta', '2018-05-11'),
('2018-07-05 18:11:50.38', '1', 'L1', 'Debe realizar un examen de sangre para verificar niveles de globulos blancos y rojos', '2018-07-05'),
('2018-07-05 18:15:16.68', '1', 'L1', 'Revisar niveles de sangre y globulos', '2018-07-05');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `recetas`
--

DROP TABLE IF EXISTS `recetas`;
CREATE TABLE IF NOT EXISTS `recetas` (
  `ID_Receta` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `ID_Medico` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `ID_Beneficiario` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `Fecha_Receta` date NOT NULL,
  PRIMARY KEY (`ID_Receta`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `recetas`
--

INSERT INTO `recetas` (`ID_Receta`, `ID_Medico`, `ID_Beneficiario`, `Fecha_Receta`) VALUES
('2018-05-08 15:37:59.288', '741', '42321', '2018-05-08'),
('2018-05-08 15:41:49.38', '741', '42321', '2018-05-08'),
('2018-05-08 15:50:29.218', '741', '47896', '2018-05-08'),
('2018-05-09 11:30:11.915', '741', '47896', '2018-05-09'),
('2018-05-09 11:36:41.613', '741', '41274', '2018-05-09'),
('2018-05-09 12:22:01.486', '741', '47896', '2018-05-09'),
('2018-05-09 12:38:08.168', '741', '47896', '2018-05-09'),
('2018-05-10 15:21:49.892', '649', '43003', '2018-05-10'),
('2018-05-10 15:31:03.615', '649', '41274', '2018-05-10'),
('2018-05-11 18:19:28.318', '649', '41274', '2018-05-11'),
('2018-07-05 18:13:02.584', 'med100', '1', '2018-07-05'),
('2018-07-05 18:15:49.544', 'med100', '1', '2018-07-05');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `signos_vitales`
--

DROP TABLE IF EXISTS `signos_vitales`;
CREATE TABLE IF NOT EXISTS `signos_vitales` (
  `ID_Signos_Vitales` char(50) NOT NULL,
  `Estatura` int(11) NOT NULL,
  `Fecha` date NOT NULL,
  `Frecuencia_Cardiaca` int(11) NOT NULL,
  `Frecuencia_Respiratoria` int(11) NOT NULL,
  `Indice_Masa_Corporal` float NOT NULL,
  `ID_Beneficiario` varchar(50) NOT NULL,
  `Peso` float NOT NULL,
  `Presion1` int(11) NOT NULL,
  `Presion2` int(11) NOT NULL,
  `Pulso` int(11) NOT NULL,
  `Temperatura_Axilar` float NOT NULL,
  `Temperatura_Oral` float NOT NULL,
  `Temperatra_Rectal` float NOT NULL,
  PRIMARY KEY (`ID_Signos_Vitales`),
  KEY `ID_Beneficiario` (`ID_Beneficiario`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `signos_vitales`
--

INSERT INTO `signos_vitales` (`ID_Signos_Vitales`, `Estatura`, `Fecha`, `Frecuencia_Cardiaca`, `Frecuencia_Respiratoria`, `Indice_Masa_Corporal`, `ID_Beneficiario`, `Peso`, `Presion1`, `Presion2`, `Pulso`, `Temperatura_Axilar`, `Temperatura_Oral`, `Temperatra_Rectal`) VALUES
('9857454', 167, '2018-04-23', 0, 18, 23.31, '41274', 57, 90, 60, 68, 0, 36.4, 0),
('7555', 167, '2018-04-25', 0, 17, 23.24, '41274', 60, 90, 62, 70, 0, 36, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE IF NOT EXISTS `usuarios` (
  `ID_usuario` int(11) NOT NULL,
  `Username` varchar(20) NOT NULL,
  `Password` varchar(60) NOT NULL,
  `ID_Medico` varchar(50) NOT NULL,
  `Mail` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`ID_usuario`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`ID_usuario`, `Username`, `Password`, `ID_Medico`, `Mail`) VALUES
(100, 'Mike', '*34ACFF81375E8030527EE438CBF37B10E4B4BDC0', '', 'miguelfrade@ieee.org'),
(400, 'Juan', '123456789', '741', 'juan@gmail.com'),
(222, 'rosesp', '87654321', '649', 'rosEsp@ssu-lp.bo'),
(555, 'patgon', 'Ssulp2018', 'med100', NULL);
--
-- Base de datos: `test`
--
CREATE DATABASE IF NOT EXISTS `test` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `test`;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
