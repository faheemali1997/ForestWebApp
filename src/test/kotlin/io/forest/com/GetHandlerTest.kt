package io.forest.com

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent
import kotlin.test.Test
import kotlin.test.assertEquals

class AppTest {
    @Test
    fun testAppHasAGreeting() {
        val classUnderTest = GetHandler()
        val input = APIGatewayProxyRequestEvent()
        var output = classUnderTest.handleRequest(input, null).body
        var expectedOutput =
            "{\"Apple\":[{\"Which seed would you sow?\":\"Furry light seed\",\"Which type of music would you play?\":\"Smooth and relaxing jazz\",\"Which book would you like to read\":\"The Wandering Midnight Sole\",\"A new book, where to start?\":\"Jump to the io.test.com.main text\",\"Tired after studying for some time, you decide to\":\"Grab some snacks\",\"An idea strikes you out of the blue, how would you write it down?\":\"Write on the book you\\u0027re reading\",\"TGIF! Where are we going tomorrow?\":\"Historical site dating back to 9,000BC\",\"Time flies so fast, it\\u0027s supper time\":\"Cook your own meal\"}],\"Bamboo\":[{\"Which seed would you sow?\":\"Veined hard seed\",\"Which type of music would you play?\":\"Soft classical piano\",\"Which book would you like to read\":\"Life Hacks\",\"A new book, where to start?\":\"Jump to the io.test.com.main text\",\"Tired after studying for some time, you decide to\":\"Drink coffee for an energy boost\",\"An idea strikes you out of the blue, how would you write it down?\":\"Make a mental note\",\"TGIF! Where are we going tomorrow?\":\"Art museum with comprehensive exhibition\",\"Time flies so fast, it\\u0027s supper time\":\"Eat later cause you\\u0027re too lazy\"},{\"Which seed would you sow?\":\"Shiny golden seed\",\"Which type of music would you play?\":\"Relaxing chill house\",\"Which book would you like to read\":\"Criminal Mastermind: Chicago Hitman\",\"A new book, where to start?\":\"Turn on the last page for abstract\",\"Tired after studying for some time, you decide to\":\"Drink coffee for an energy boost\",\"An idea strikes you out of the blue, how would you write it down?\":\"Write the details in a notebook\",\"TGIF! Where are we going tomorrow?\":\"Art museum with comprehensive exhibition\",\"Time flies so fast, it\\u0027s supper time\":\"Order food delivery online\"}],\"Bear\\u0027s Paw\":[{\"Which seed would you sow?\":\"Veined hard seed\",\"Which type of music would you play?\":\"Relaxing chill house\",\"Which book would you like to read\":\"The Wandering Midnight Sole\",\"A new book, where to start?\":\"Read a prologue\",\"Tired after studying for some time, you decide to\":\"Take a nap\",\"An idea strikes you out of the blue, how would you write it down?\":\"Jot it down on a Post-it note\",\"TGIF! Where are we going tomorrow?\":\"Cultural and creative market full of eye-catching designs\",\"Time flies so fast, it\\u0027s supper time\":\"Eat later cause you\\u0027re too lazy\"},{\"Which seed would you sow?\":\"Veined hard seed\",\"Which type of music would you play?\":\"Soft classical piano\",\"Which book would you like to read\":\"50 Mind Blowing Philosophical Questions: The Enslaved\",\"A new book, where to start?\":\"Read a prologue\",\"Tired after studying for some time, you decide to\":\"Drink coffee for an energy boost\",\"An idea strikes you out of the blue, how would you write it down?\":\"Make a mental note\",\"TGIF! Where are we going tomorrow?\":\"Historical site dating back to 9,000BC\",\"Time flies so fast, it\\u0027s supper time\":\"Order food delivery online\"}],\"Cactus\":[{\"Which seed would you sow?\":\"Veined hard seed\",\"Which type of music would you play?\":\"Soft classical piano\",\"Which book would you like to read\":\"Life Hacks\",\"A new book, where to start?\":\"Jump to the io.test.com.main text\",\"Tired after studying for some time, you decide to\":\"Drink coffee for an energy boost\",\"An idea strikes you out of the blue, how would you write it down?\":\"Make a mental note\",\"TGIF! Where are we going tomorrow?\":\"Historical site dating back to 9,000BC\",\"Time flies so fast, it\\u0027s supper time\":\"Eat out at a restaurant\"}],\"Carnation\":[{\"Which seed would you sow?\":\"Veined hard seed\",\"Which type of music would you play?\":\"Soft classical piano\",\"Which book would you like to read\":\"Criminal Mastermind: Chicago Hitman\",\"A new book, where to start?\":\"Read a prologue\",\"Tired after studying for some time, you decide to\":\"Take a nap\",\"An idea strikes you out of the blue, how would you write it down?\":\"Jot it down on a Post-it note\",\"TGIF! Where are we going tomorrow?\":\"Cultural and creative market full of eye-catching designs\",\"Time flies so fast, it\\u0027s supper time\":\"Cook your own meal\"},{\"Which seed would you sow?\":\"Veined hard seed\",\"Which type of music would you play?\":\"Smooth and relaxing jazz\",\"Which book would you like to read\":\"50 Mind Blowing Philosophical Questions: The Enslaved\",\"A new book, where to start?\":\"Read a prologue\",\"Tired after studying for some time, you decide to\":\"Do a full-body stretch\",\"An idea strikes you out of the blue, how would you write it down?\":\"Write the details in a notebook\",\"TGIF! Where are we going tomorrow?\":\"Art museum with comprehensive exhibition\",\"Time flies so fast, it\\u0027s supper time\":\"Cook your own meal\"},{\"Which seed would you sow?\":\"Veined hard seed\",\"Which type of music would you play?\":\"Smooth and relaxing jazz\",\"Which book would you like to read\":\"Criminal Mastermind: Chicago Hitman\",\"A new book, where to start?\":\"Read a prologue\",\"Tired after studying for some time, you decide to\":\"Do a full-body stretch\",\"An idea strikes you out of the blue, how would you write it down?\":\"Make a mental note\",\"TGIF! Where are we going tomorrow?\":\"Cultural and creative market full of eye-catching designs\",\"Time flies so fast, it\\u0027s supper time\":\"Eat later cause you\\u0027re too lazy\"}],\"Cat-tail Willow\":[{\"Which seed would you sow?\":\"Veined hard seed\",\"Which type of music would you play?\":\"Ambient sound of ocean waves\",\"Which book would you like to read\":\"The Wandering Midnight Sole\",\"A new book, where to start?\":\"Turn on the last page for abstract\",\"Tired after studying for some time, you decide to\":\"Drink coffee for an energy boost\",\"An idea strikes you out of the blue, how would you write it down?\":\"Jot it down on a Post-it note\",\"TGIF! Where are we going tomorrow?\":\"Cultural and creative market full of eye-catching designs\",\"Time flies so fast, it\\u0027s supper time\":\"Eat out at a restaurant\"},{\"Which seed would you sow?\":\"Veined hard seed\",\"Which type of music would you play?\":\"Relaxing chill house\",\"Which book would you like to read\":\"Life Hacks\",\"A new book, where to start?\":\"Turn on the last page for abstract\",\"Tired after studying for some time, you decide to\":\"Drink coffee for an energy boost\",\"An idea strikes you out of the blue, how would you write it down?\":\"Write on the book you\\u0027re reading\",\"TGIF! Where are we going tomorrow?\":\"Art museum with comprehensive exhibition\",\"Time flies so fast, it\\u0027s supper time\":\"Eat out at a restaurant\"},{\"Which seed would you sow?\":\"Shiny golden seed\",\"Which type of music would you play?\":\"Relaxing chill house\",\"Which book would you like to read\":\"50 Mind Blowing Philosophical Questions: The Enslaved\",\"A new book, where to start?\":\"Turn on the last page for abstract\",\"Tired after studying for some time, you decide to\":\"Grab some snacks\",\"An idea strikes you out of the blue, how would you write it down?\":\"Write on the book you\\u0027re reading\",\"TGIF! Where are we going tomorrow?\":\"Historical site dating back to 9,000BC\",\"Time flies so fast, it\\u0027s supper time\":\"Eat out at a restaurant\"},{\"Which seed would you sow?\":\"Shiny golden seed\",\"Which type of music would you play?\":\"Ambient sound of ocean waves\",\"Which book would you like to read\":\"50 Mind Blowing Philosophical Questions: The Enslaved\",\"A new book, where to start?\":\"Read a prologue\",\"Tired after studying for some time, you decide to\":\"Grab some snacks\",\"An idea strikes you out of the blue, how would you write it down?\":\"Jot it down on a Post-it note\",\"TGIF! Where are we going tomorrow?\":\"Historical site dating back to 9,000BC\",\"Time flies so fast, it\\u0027s supper time\":\"Order food delivery online\"},{\"Which seed would you sow?\":\"Veined hard seed\",\"Which type of music would you play?\":\"Ambient sound of ocean waves\",\"Which book would you like to read\":\"50 Mind Blowing Philosophical Questions: The Enslaved\",\"A new book, where to start?\":\"Check out the contents\",\"Tired after studying for some time, you decide to\":\"Grab some snacks\",\"An idea strikes you out of the blue, how would you write it down?\":\"Write on the book you\\u0027re reading\",\"TGIF! Where are we going tomorrow?\":\"Hiking trail with grassy picnic spots\",\"Time flies so fast, it\\u0027s supper time\":\"Cook your own meal\"},{\"Which seed would you sow?\":\"Shiny golden seed\",\"Which type of music would you play?\":\"Soft classical piano\",\"Which book would you like to read\":\"50 Mind Blowing Philosophical Questions: The Enslaved\",\"A new book, where to start?\":\"Check out the contents\",\"Tired after studying for some time, you decide to\":\"Take a nap\",\"An idea strikes you out of the blue, how would you write it down?\":\"Write the details in a notebook\",\"TGIF! Where are we going tomorrow?\":\"Cultural and creative market full of eye-catching designs\",\"Time flies so fast, it\\u0027s supper time\":\"Eat later cause you\\u0027re too lazy\"}],\"Cherry Blossom\":[{\"Which seed would you sow?\":\"Shiny golden seed\",\"Which type of music would you play?\":\"Soft classical piano\",\"Which book would you like to read\":\"Criminal Mastermind: Chicago Hitman\",\"A new book, where to start?\":\"Check out the contents\",\"Tired after studying for some time, you decide to\":\"Grab some snacks\",\"An idea strikes you out of the blue, how would you write it down?\":\"Make a mental note\",\"TGIF! Where are we going tomorrow?\":\"Hiking trail with grassy picnic spots\",\"Time flies so fast, it\\u0027s supper time\":\"Cook your own meal\"}],\"Chinese Pine\":[{\"Which seed would you sow?\":\"Furry light seed\",\"Which type of music would you play?\":\"Soft classical piano\",\"Which book would you like to read\":\"Criminal Mastermind: Chicago Hitman\",\"A new book, where to start?\":\"Jump to the io.test.com.main text\",\"Tired after studying for some time, you decide to\":\"Take a nap\",\"An idea strikes you out of the blue, how would you write it down?\":\"Make a mental note\",\"TGIF! Where are we going tomorrow?\":\"Hiking trail with grassy picnic spots\",\"Time flies so fast, it\\u0027s supper time\":\"Eat later cause you\\u0027re too lazy\"},{\"Which seed would you sow?\":\"Furry light seed\",\"Which type of music would you play?\":\"Smooth and relaxing jazz\",\"Which book would you like to read\":\"Criminal Mastermind: Chicago Hitman\",\"A new book, where to start?\":\"Check out the contents\",\"Tired after studying for some time, you decide to\":\"Take a nap\",\"An idea strikes you out of the blue, how would you write it down?\":\"Write the details in a notebook\",\"TGIF! Where are we going tomorrow?\":\"Hiking trail with grassy picnic spots\",\"Time flies so fast, it\\u0027s supper time\":\"Cook your own meal\"},{\"Which seed would you sow?\":\"Furry light seed\",\"Which type of music would you play?\":\"Smooth and relaxing jazz\",\"Which book would you like to read\":\"Life Hacks\",\"A new book, where to start?\":\"Turn on the last page for abstract\",\"Tired after studying for some time, you decide to\":\"Drink coffee for an energy boost\",\"An idea strikes you out of the blue, how would you write it down?\":\"Make a mental note\",\"TGIF! Where are we going tomorrow?\":\"Historical site dating back to 9,000BC\",\"Time flies so fast, it\\u0027s supper time\":\"Eat later cause you\\u0027re too lazy\"}],\"Coconut\":[{\"Which seed would you sow?\":\"Large plump seed\",\"Which type of music would you play?\":\"Soft classical piano\",\"Which book would you like to read\":\"The Wandering Midnight Sole\",\"A new book, where to start?\":\"Jump to the io.test.com.main text\",\"Tired after studying for some time, you decide to\":\"Do a full-body stretch\",\"An idea strikes you out of the blue, how would you write it down?\":\"Make a mental note\",\"TGIF! Where are we going tomorrow?\":\"Cultural and creative market full of eye-catching designs\",\"Time flies so fast, it\\u0027s supper time\":\"Eat later cause you\\u0027re too lazy\"},{\"Which seed would you sow?\":\"Shiny golden seed\",\"Which type of music would you play?\":\"Soft classical piano\",\"Which book would you like to read\":\"The Wandering Midnight Sole\",\"A new book, where to start?\":\"Jump to the io.test.com.main text\",\"Tired after studying for some time, you decide to\":\"Grab some snacks\",\"An idea strikes you out of the blue, how would you write it down?\":\"Make a mental note\",\"TGIF! Where are we going tomorrow?\":\"Hiking trail with grassy picnic spots\",\"Time flies so fast, it\\u0027s supper time\":\"Cook your own meal\"},{\"Which seed would you sow?\":\"Shiny golden seed\",\"Which type of music would you play?\":\"Soft classical piano\",\"Which book would you like to read\":\"Life Hacks\",\"A new book, where to start?\":\"Jump to the io.test.com.main text\",\"Tired after studying for some time, you decide to\":\"Do a full-body stretch\",\"An idea strikes you out of the blue, how would you write it down?\":\"Jot it down on a Post-it note\",\"TGIF! Where are we going tomorrow?\":\"Hiking trail with grassy picnic spots\",\"Time flies so fast, it\\u0027s supper time\":\"Eat out at a restaurant\"}],\"Ginkgo\":[{\"Which seed would you sow?\":\"Large plump seed\",\"Which type of music would you play?\":\"Relaxing chill house\",\"Which book would you like to read\":\"The Wandering Midnight Sole\",\"A new book, where to start?\":\"Turn on the last page for abstract\",\"Tired after studying for some time, you decide to\":\"Do a full-body stretch\",\"An idea strikes you out of the blue, how would you write it down?\":\"Write on the book you\\u0027re reading\",\"TGIF! Where are we going tomorrow?\":\"Hiking trail with grassy picnic spots\",\"Time flies so fast, it\\u0027s supper time\":\"Order food delivery online\"}],\"Lemon\":[{\"Which seed would you sow?\":\"Furry light seed\",\"Which type of music would you play?\":\"Relaxing chill house\",\"Which book would you like to read\":\"Criminal Mastermind: Chicago Hitman\",\"A new book, where to start?\":\"Turn on the last page for abstract\",\"Tired after studying for some time, you decide to\":\"Take a nap\",\"An idea strikes you out of the blue, how would you write it down?\":\"Write on the book you\\u0027re reading\",\"TGIF! Where are we going tomorrow?\":\"Hiking trail with grassy picnic spots\",\"Time flies so fast, it\\u0027s supper time\":\"Eat out at a restaurant\"}],\"Maple\":[{\"Which seed would you sow?\":\"Shiny golden seed\",\"Which type of music would you play?\":\"Ambient sound of ocean waves\",\"Which book would you like to read\":\"Criminal Mastermind: Chicago Hitman\",\"A new book, where to start?\":\"Read a prologue\",\"Tired after studying for some time, you decide to\":\"Take a nap\",\"An idea strikes you out of the blue, how would you write it down?\":\"Jot it down on a Post-it note\",\"TGIF! Where are we going tomorrow?\":\"Hiking trail with grassy picnic spots\",\"Time flies so fast, it\\u0027s supper time\":\"Cook your own meal\"},{\"Which seed would you sow?\":\"Furry light seed\",\"Which type of music would you play?\":\"Soft classical piano\",\"Which book would you like to read\":\"Life Hacks\",\"A new book, where to start?\":\"Turn on the last page for abstract\",\"Tired after studying for some time, you decide to\":\"Take a nap\",\"An idea strikes you out of the blue, how would you write it down?\":\"Make a mental note\",\"TGIF! Where are we going tomorrow?\":\"Art museum with comprehensive exhibition\",\"Time flies so fast, it\\u0027s supper time\":\"Eat out at a restaurant\"},{\"Which seed would you sow?\":\"Large plump seed\",\"Which type of music would you play?\":\"Soft classical piano\",\"Which book would you like to read\":\"50 Mind Blowing Philosophical Questions: The Enslaved\",\"A new book, where to start?\":\"Turn on the last page for abstract\",\"Tired after studying for some time, you decide to\":\"Take a nap\",\"An idea strikes you out of the blue, how would you write it down?\":\"Write the details in a notebook\",\"TGIF! Where are we going tomorrow?\":\"Art museum with comprehensive exhibition\",\"Time flies so fast, it\\u0027s supper time\":\"Eat out at a restaurant\"},{\"Which seed would you sow?\":\"Veined hard seed\",\"Which type of music would you play?\":\"Relaxing chill house\",\"Which book would you like to read\":\"Criminal Mastermind: Chicago Hitman\",\"A new book, where to start?\":\"Jump to the io.test.com.main text\",\"Tired after studying for some time, you decide to\":\"Take a nap\",\"An idea strikes you out of the blue, how would you write it down?\":\"Make a mental note\",\"TGIF! Where are we going tomorrow?\":\"Hiking trail with grassy picnic spots\",\"Time flies so fast, it\\u0027s supper time\":\"Cook your own meal\"},{\"Which seed would you sow?\":\"Shiny golden seed\",\"Which type of music would you play?\":\"Ambient sound of ocean waves\",\"Which book would you like to read\":\"50 Mind Blowing Philosophical Questions: The Enslaved\",\"A new book, where to start?\":\"Read a prologue\",\"Tired after studying for some time, you decide to\":\"Take a nap\",\"An idea strikes you out of the blue, how would you write it down?\":\"Make a mental note\",\"TGIF! Where are we going tomorrow?\":\"Art museum with comprehensive exhibition\",\"Time flies so fast, it\\u0027s supper time\":\"Cook your own meal\"},{\"Which seed would you sow?\":\"Furry light seed\",\"Which type of music would you play?\":\"Ambient sound of ocean waves\",\"Which book would you like to read\":\"Criminal Mastermind: Chicago Hitman\",\"A new book, where to start?\":\"Turn on the last page for abstract\",\"Tired after studying for some time, you decide to\":\"Take a nap\",\"An idea strikes you out of the blue, how would you write it down?\":\"Make a mental note\",\"TGIF! Where are we going tomorrow?\":\"Cultural and creative market full of eye-catching designs\",\"Time flies so fast, it\\u0027s supper time\":\"Eat out at a restaurant\"}],\"Oak\":[{\"Which seed would you sow?\":\"Veined hard seed\",\"Which type of music would you play?\":\"Smooth and relaxing jazz\",\"Which book would you like to read\":\"Life Hacks\",\"A new book, where to start?\":\"Check out the contents\",\"Tired after studying for some time, you decide to\":\"Drink coffee for an energy boost\",\"An idea strikes you out of the blue, how would you write it down?\":\"Write the details in a notebook\",\"TGIF! Where are we going tomorrow?\":\"Art museum with comprehensive exhibition\",\"Time flies so fast, it\\u0027s supper time\":\"Cook your own meal\"},{\"Which seed would you sow?\":\"Large plump seed\",\"Which type of music would you play?\":\"Smooth and relaxing jazz\",\"Which book would you like to read\":\"The Wandering Midnight Sole\",\"A new book, where to start?\":\"Read a prologue\",\"Tired after studying for some time, you decide to\":\"Grab some snacks\",\"An idea strikes you out of the blue, how would you write it down?\":\"Write the details in a notebook\",\"TGIF! Where are we going tomorrow?\":\"Historical site dating back to 9,000BC\",\"Time flies so fast, it\\u0027s supper time\":\"Order food delivery online\"},{\"Which seed would you sow?\":\"Furry light seed\",\"Which type of music would you play?\":\"Relaxing chill house\",\"Which book would you like to read\":\"The Wandering Midnight Sole\",\"A new book, where to start?\":\"Turn on the last page for abstract\",\"Tired after studying for some time, you decide to\":\"Take a nap\",\"An idea strikes you out of the blue, how would you write it down?\":\"Write the details in a notebook\",\"TGIF! Where are we going tomorrow?\":\"Historical site dating back to 9,000BC\",\"Time flies so fast, it\\u0027s supper time\":\"Order food delivery online\"}],\"Rose\":[{\"Which seed would you sow?\":\"Furry light seed\",\"Which type of music would you play?\":\"Ambient sound of ocean waves\",\"Which book would you like to read\":\"Criminal Mastermind: Chicago Hitman\",\"A new book, where to start?\":\"Read a prologue\",\"Tired after studying for some time, you decide to\":\"Take a nap\",\"An idea strikes you out of the blue, how would you write it down?\":\"Jot it down on a Post-it note\",\"TGIF! Where are we going tomorrow?\":\"Hiking trail with grassy picnic spots\",\"Time flies so fast, it\\u0027s supper time\":\"Order food delivery online\"},{\"Which seed would you sow?\":\"Veined hard seed\",\"Which type of music would you play?\":\"Ambient sound of ocean waves\",\"Which book would you like to read\":\"Life Hacks\",\"A new book, where to start?\":\"Read a prologue\",\"Tired after studying for some time, you decide to\":\"Drink coffee for an energy boost\",\"An idea strikes you out of the blue, how would you write it down?\":\"Jot it down on a Post-it note\",\"TGIF! Where are we going tomorrow?\":\"Art museum with comprehensive exhibition\",\"Time flies so fast, it\\u0027s supper time\":\"Order food delivery online\"},{\"Which seed would you sow?\":\"Veined hard seed\",\"Which type of music would you play?\":\"Smooth and relaxing jazz\",\"Which book would you like to read\":\"Life Hacks\",\"A new book, where to start?\":\"Turn on the last page for abstract\",\"Tired after studying for some time, you decide to\":\"Take a nap\",\"An idea strikes you out of the blue, how would you write it down?\":\"Jot it down on a Post-it note\",\"TGIF! Where are we going tomorrow?\":\"Hiking trail with grassy picnic spots\",\"Time flies so fast, it\\u0027s supper time\":\"Eat later cause you\\u0027re too lazy\"},{\"Which seed would you sow?\":\"Veined hard seed\",\"Which type of music would you play?\":\"Soft classical piano\",\"Which book would you like to read\":\"Criminal Mastermind: Chicago Hitman\",\"A new book, where to start?\":\"Jump to the io.test.com.main text\",\"Tired after studying for some time, you decide to\":\"Take a nap\",\"An idea strikes you out of the blue, how would you write it down?\":\"Jot it down on a Post-it note\",\"TGIF! Where are we going tomorrow?\":\"Art museum with comprehensive exhibition\",\"Time flies so fast, it\\u0027s supper time\":\"Eat later cause you\\u0027re too lazy\"},{\"Which seed would you sow?\":\"Furry light seed\",\"Which type of music would you play?\":\"Soft classical piano\",\"Which book would you like to read\":\"Criminal Mastermind: Chicago Hitman\",\"A new book, where to start?\":\"Turn on the last page for abstract\",\"Tired after studying for some time, you decide to\":\"Do a full-body stretch\",\"An idea strikes you out of the blue, how would you write it down?\":\"Jot it down on a Post-it note\",\"TGIF! Where are we going tomorrow?\":\"Historical site dating back to 9,000BC\",\"Time flies so fast, it\\u0027s supper time\":\"Eat later cause you\\u0027re too lazy\"},{\"Which seed would you sow?\":\"Furry light seed\",\"Which type of music would you play?\":\"Ambient sound of ocean waves\",\"Which book would you like to read\":\"The Wandering Midnight Sole\",\"A new book, where to start?\":\"Check out the contents\",\"Tired after studying for some time, you decide to\":\"Drink coffee for an energy boost\",\"An idea strikes you out of the blue, how would you write it down?\":\"Make a mental note\",\"TGIF! Where are we going tomorrow?\":\"Cultural and creative market full of eye-catching designs\",\"Time flies so fast, it\\u0027s supper time\":\"Eat later cause you\\u0027re too lazy\"}],\"Sunflower\":[{\"Which seed would you sow?\":\"Large plump seed\",\"Which type of music would you play?\":\"Ambient sound of ocean waves\",\"Which book would you like to read\":\"The Wandering Midnight Sole\",\"A new book, where to start?\":\"Read a prologue\",\"Tired after studying for some time, you decide to\":\"Do a full-body stretch\",\"An idea strikes you out of the blue, how would you write it down?\":\"Jot it down on a Post-it note\",\"TGIF! Where are we going tomorrow?\":\"Cultural and creative market full of eye-catching designs\",\"Time flies so fast, it\\u0027s supper time\":\"Order food delivery online\"},{\"Which seed would you sow?\":\"Large plump seed\",\"Which type of music would you play?\":\"Relaxing chill house\",\"Which book would you like to read\":\"The Wandering Midnight Sole\",\"A new book, where to start?\":\"Turn on the last page for abstract\",\"Tired after studying for some time, you decide to\":\"Do a full-body stretch\",\"An idea strikes you out of the blue, how would you write it down?\":\"Write on the book you\\u0027re reading\",\"TGIF! Where are we going tomorrow?\":\"Cultural and creative market full of eye-catching designs\",\"Time flies so fast, it\\u0027s supper time\":\"Eat out at a restaurant\"},{\"Which seed would you sow?\":\"Large plump seed\",\"Which type of music would you play?\":\"Smooth and relaxing jazz\",\"Which book would you like to read\":\"The Wandering Midnight Sole\",\"A new book, where to start?\":\"Check out the contents\",\"Tired after studying for some time, you decide to\":\"Do a full-body stretch\",\"An idea strikes you out of the blue, how would you write it down?\":\"Write the details in a notebook\",\"TGIF! Where are we going tomorrow?\":\"Cultural and creative market full of eye-catching designs\",\"Time flies so fast, it\\u0027s supper time\":\"Cook your own meal\"},{\"Which seed would you sow?\":\"Shiny golden seed\",\"Which type of music would you play?\":\"Smooth and relaxing jazz\",\"Which book would you like to read\":\"50 Mind Blowing Philosophical Questions: The Enslaved\",\"A new book, where to start?\":\"Check out the contents\",\"Tired after studying for some time, you decide to\":\"Grab some snacks\",\"An idea strikes you out of the blue, how would you write it down?\":\"Write the details in a notebook\",\"TGIF! Where are we going tomorrow?\":\"Historical site dating back to 9,000BC\",\"Time flies so fast, it\\u0027s supper time\":\"Cook your own meal\"},{\"Which seed would you sow?\":\"Veined hard seed\",\"Which type of music would you play?\":\"Ambient sound of ocean waves\",\"Which book would you like to read\":\"Life Hacks\",\"A new book, where to start?\":\"Turn on the last page for abstract\",\"Tired after studying for some time, you decide to\":\"Grab some snacks\",\"An idea strikes you out of the blue, how would you write it down?\":\"Write on the book you\\u0027re reading\",\"TGIF! Where are we going tomorrow?\":\"Cultural and creative market full of eye-catching designs\",\"Time flies so fast, it\\u0027s supper time\":\"Cook your own meal\"}],\"Wisteria\":[{\"Which seed would you sow?\":\"Veined hard seed\",\"Which type of music would you play?\":\"Ambient sound of ocean waves\",\"Which book would you like to read\":\"50 Mind Blowing Philosophical Questions: The Enslaved\",\"A new book, where to start?\":\"Jump to the io.test.com.main text\",\"Tired after studying for some time, you decide to\":\"Drink coffee for an energy boost\",\"An idea strikes you out of the blue, how would you write it down?\":\"Jot it down on a Post-it note\",\"TGIF! Where are we going tomorrow?\":\"Historical site dating back to 9,000BC\",\"Time flies so fast, it\\u0027s supper time\":\"Eat later cause you\\u0027re too lazy\"},{\"Which seed would you sow?\":\"Veined hard seed\",\"Which type of music would you play?\":\"Ambient sound of ocean waves\",\"Which book would you like to read\":\"Life Hacks\",\"A new book, where to start?\":\"Read a prologue\",\"Tired after studying for some time, you decide to\":\"Drink coffee for an energy boost\",\"An idea strikes you out of the blue, how would you write it down?\":\"Jot it down on a Post-it note\",\"TGIF! Where are we going tomorrow?\":\"Cultural and creative market full of eye-catching designs\",\"Time flies so fast, it\\u0027s supper time\":\"Eat later cause you\\u0027re too lazy\"},{\"Which seed would you sow?\":\"Large plump seed\",\"Which type of music would you play?\":\"Relaxing chill house\",\"Which book would you like to read\":\"50 Mind Blowing Philosophical Questions: The Enslaved\",\"A new book, where to start?\":\"Check out the contents\",\"Tired after studying for some time, you decide to\":\"Take a nap\",\"An idea strikes you out of the blue, how would you write it down?\":\"Jot it down on a Post-it note\",\"TGIF! Where are we going tomorrow?\":\"Art museum with comprehensive exhibition\",\"Time flies so fast, it\\u0027s supper time\":\"Eat later cause you\\u0027re too lazy\"}]}"
        assertEquals(expectedOutput,output)
    }
}