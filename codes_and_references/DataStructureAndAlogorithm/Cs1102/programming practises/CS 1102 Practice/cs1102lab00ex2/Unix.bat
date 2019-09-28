@echo off
set CMDIR=%~d0%~p0
java %CMDIR%\Unix  < %CMDIR%\testdata1.txt
