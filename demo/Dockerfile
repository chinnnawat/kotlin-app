FROM eclipse-temurin:17

WORKDIR /app

COPY . /app

EXPOSE 8080

RUN chmod +x start.sh && ./gradlew build --no-daemon

CMD ["sh", "start.sh"]