@echo off
set CMDIR=%~d0%~p0
java %CMDIR%\Anagram  < %CMDIR%\testdata1.txt
