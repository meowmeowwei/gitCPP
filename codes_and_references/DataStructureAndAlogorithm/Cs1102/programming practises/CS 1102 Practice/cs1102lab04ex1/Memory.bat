@echo off
set CMDIR=%~d0%~p0
java %CMDIR%\Memory  < %CMDIR%\testdata1.txt
