@echo off
set CMDIR=%~d0%~p0
java %CMDIR%\GraphicsDriver  < %CMDIR%\testdata1.txt
