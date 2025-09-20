FROM eclipse-temurin:21

WORKDIR /app

COPY gradlew gradlew.bat ./
COPY gradle/ gradle/
COPY build.gradle.kts settings.gradle.kts ./

RUN chmod +x gradlew

RUN ./gradlew dependencies --no-daemon

COPY src/ src/
COPY start.sh ./

RUN ./gradlew build --no-daemon

EXPOSE 8080

RUN chmod +x start.sh

CMD ["sh", "start.sh"]