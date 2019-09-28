@echo off
set CMDIR=%~d0%~p0
java %CMDIR%\TestVehicle  < %CMDIR%\testdata1.txt
