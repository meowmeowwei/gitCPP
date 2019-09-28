@echo off
set CMDIR=%~d0%~p0
java %CMDIR%\TestShape  < %CMDIR%\testdata1.txt
