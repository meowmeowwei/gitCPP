@echo off
set CMDIR=%~d0%~p0
java %CMDIR%\threeNplusOne  < %CMDIR%\testdata1.txt
