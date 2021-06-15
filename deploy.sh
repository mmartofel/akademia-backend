mvn package

git add .
git commit -m "`date`"
git push origin main

oc delete all --selector app=akademia-backend
oc new-app https://github.com/mmartofel/akademia-backend
