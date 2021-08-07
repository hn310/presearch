echo "-> Run bash individually - Type 'presearchbuild' to build the project"
presearchbuild() {
  echo "mvn clean package"
  mvn clean package
}
echo "-> Run bash individually - Type 'presearchrun' to run the executable"
presearchrun() {
  echo "Running executable > mvn spring-boot:run"
  mvn spring-boot:run
}

presearchbuild
presearchrun