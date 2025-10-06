# Kotlin Project Commands

## Clean and Build Dependencies

```bash
# Using Gradle
./gradlew clean build

# Clean only
./gradlew clean

# Build only  
./gradlew build

# Refresh dependencies
./gradlew build --refresh-dependencies

# Clean build with dependency refresh
./gradlew clean build --refresh-dependencies
```

## Using Maven (if applicable)

```bash
# Clean and compile
mvn clean compile

# Clean and package
mvn clean package

# Force update dependencies
mvn clean compile -U
```