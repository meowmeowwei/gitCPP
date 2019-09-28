@echo off
set CMDIR=%~d0%~p0
java %CMDIR%\CutNPaste  < %CMDIR%\testdata1.txt
