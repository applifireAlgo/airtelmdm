




echo $PATH
DB_PATH=/tmp/applifire/db/HMM9LR6AOTUWZ7UGLRNLG/2EE68217-9341-4750-B93F-542AF37C14AD
MYSQL=/usr/bin
USER=airtelmdm
PASSWORD=Glass4#21
HOST=localhost


echo 'drop db starts....'
$MYSQL/mysql -h$HOST -u$USER -p$PASSWORD -e "SOURCE $DB_PATH/drop_db.sql";
echo 'drop db ends....'