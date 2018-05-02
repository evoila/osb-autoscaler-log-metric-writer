package de.evoila.cf.elasticsearch.writer.model

/**
 * Created by reneschollmeyer, evoila on 19.03.18.
 */
class ElasticsearchWriterObject(val timestamp: Long,
                                val logMessage: String,
                                val logMessageType: String,
                                val appId: String,
                                val appName: String,
                                val space: String,
                                val organization: String) {


}