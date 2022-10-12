package example.mongodb

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/book")
class BookController(private var bookService: BookService) {

    @Get
    fun list(): MutableIterable<Device> {
        return bookService.list()
    }
}