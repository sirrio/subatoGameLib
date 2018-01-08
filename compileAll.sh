# script to compile all (including klaus example)
# by david martin

rm -r framework/classes
rm -r swingBackend/classes
rm -r javafxBackend/classes
rm -r examples/klaus/classes

mkdir framework/classes
mkdir swingBackend/classes
mkdir javafxBackend/classes
mkdir examples/klaus/classes

javac -d framework/classes framework/src/name/panitz/game/framework/*.java framework/src/name/panitz/game/example/simple/*.java

javac -cp framework/classes -d swingBackend/classes swingBackend/src/name/panitz/game/framework/swing/*.java

javac -cp framework/classes:swingBackend/classes -d javafxBackend/classes javafxBackend/src/name/panitz/game/framework/fx/*.java

javac -cp framework/classes:swingBackend/classes:javafxBackend/classes -d examples/klaus/classes examples/klaus/src/name/panitz/game/klaus/*.java
java  -cp framework/classes:swingBackend/classes:javafxBackend/classes:examples/klaus/classes:examples/klaus/resources name.panitz.game.klaus.PlayFX
