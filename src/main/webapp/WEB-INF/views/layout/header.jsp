<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="/css/global.css" />
<meta charset="UTF-8">
<title>야구장 관리사이트</title>
<img src="images/MLB.png" width="200" height="200" alt="MLB"/>
</head>
<body>
	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
		<!-- Brand/logo -->
		<a class="navbar-brand" href="#">logo</a>

		<!-- Links -->
		<ul class="navbar-nav">
			<li class="nav-item"><a class="nav-link" href="/stardium">경기장 목록</a></li>
			<li class="nav-item"><a class="nav-link" href="/stardiumSaveForm">경기장 등록</a></li>
			<li class="nav-item"><a class="nav-link" href="/team">팀 목록</a></li>
			<li class="nav-item"><a class="nav-link" href="/teamSaveForm">팀 등록</a></li>
			<li class="nav-item"><a class="nav-link" href="/player">선수 목록</a></li>
			<li class="nav-item"><a class="nav-link" href="/playerSaveForm">선수 등록</a></li>
			<li class="nav-item"><a class="nav-link" href="/position">팀 별 포지션 목록</a></li>
			<li class="nav-item"><a class="nav-link" href="/expulsion">2군 강등 선수 목록</a></li>
			<li class="nav-item"><a class="nav-link" href="/expulsionSaveForm">2군 강등 사유 등록</a></li>
		</ul>
	</nav>