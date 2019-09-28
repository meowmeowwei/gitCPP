@echo off
set CMDIR=%~d0%~p0
java %CMDIR%\myBST  < %CMDIR%\testdata1.txt
