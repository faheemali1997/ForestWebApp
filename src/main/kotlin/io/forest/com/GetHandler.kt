package io.forest.com

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent
import com.google.gson.Gson

@Suppress("unused")
class GetHandler : RequestHandler<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {
    private val responseHeader = mapOf("X-Powered-By" to "AWS Lambda & serverless")

    override fun handleRequest(input: APIGatewayProxyRequestEvent, context: Context?): APIGatewayProxyResponseEvent {
        val responseBody =  Gson().toJson(Forest().generateMapOfQuestionAndAnswers())
        return APIGatewayProxyResponseEvent()
            .withStatusCode(200)
            .withBody(responseBody)
            .withHeaders(responseHeader)
    }
}
