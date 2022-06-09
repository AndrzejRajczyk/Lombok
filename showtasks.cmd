
echo "Start, running runcrud.bat"
call c:\task\runcrud.bat
if "%ERRORLEVEL%" == "0" goto runcrudfails
if "%ERRORLEVEL%" != "0" goto firefox



:firefox
echo starting Firefox
start C:\"Program Files"\"Mozilla Firefox"\firefox.exe  -- new window  "http://localhost:8080/crud/v1/tasks/task"
if "%ERRORLEVEL%" == "0" goto firefoxfails

:runcrudfails
echo "runcrud.bat error"
goto end

:firefoxfails
echo "firefox error"
goto end


end
echo.
echo Work is finished.