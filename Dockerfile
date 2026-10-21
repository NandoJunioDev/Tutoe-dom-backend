
# primeiro sempre fazer o build da aplicação, para isso é necessário ter o maven instalado, pois ele que vai baixar as dependências e compilar a aplicação
# fique atento a versão do maven, pois a versão 3.9.0 não funciona com o java 25, então é necessário usar a versão 3.9.1 ou superior
from maven:3.9-eclipse-temurin-25-alpine AS build 
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline
COPY  . . 
RUN mvn package -DskipTests 



from eclipse-temurin:25-jre-alpine
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
