# Forest WebApp using AWS Serverless

If you are curious to find your personal flower based on your personality then try taking this Personality test by Forest:
https://forest-mt.seekrtech.com

I've used the Forest Application for a long time now as it helps me focus and dims all the distractions that arise when you own a smartphone.
I was curious to find out my personal flower when I encountered this personality test by Forest but I was even more curious to find out all the possible combinations of answers that lead to the particular result. And since the test only had few questions, I figured if I hit the APIs with enough different answers then I could map the answers to the results and find the unique combinations. Hence this API. Plus I wanted to try my hand at serverless programming using AWS Lambda.

I'm a Chinese Pine btw :p

## Usage

The api response returns all the possible answers for the personality test by Forest

## Platform
This is a serverless application hosted on AWS Lambda and uses API Gateway.

## Language
It is build on Kotlin JVM.

## Deployment

Step 1: Build the application locally
    
      `./gradlew clean build` 

Step 2: Generate the jar file:

      `./gradlew shadowjar`

Step 3: Manually you can upload the jar file from build/libs to AWS Lambda
