package name.lemerdy.sebastian.scalatest.jgiven.json

import java.lang.reflect.Type

import com.google.gson._
import org.scalatest.events._
import org.slf4j.Logger
import org.slf4j.LoggerFactory.getLogger

object GsonFormatter {

  /**
    * Needed because default serializer doesn't encode type field
    */
  class IndentedTextSerializer() extends JsonSerializer[IndentedText] {

    private lazy val logger: Logger = getLogger(getClass)

    override def serialize(src: IndentedText, typeOfSrc: Type, context: JsonSerializationContext): JsonElement = {
      logger.debug("serialize {} of type {}", List(src, typeOfSrc): _*)
      val indentedText = new JsonObject()
      indentedText.add("type", new JsonPrimitive("IndentedText"))
      indentedText.add("formattedText", new JsonPrimitive(src.formattedText))
      indentedText.add("rawText", new JsonPrimitive(src.rawText))
      indentedText.add("indentationLevel", new JsonPrimitive(src.indentationLevel))
      indentedText
    }

  }

}
