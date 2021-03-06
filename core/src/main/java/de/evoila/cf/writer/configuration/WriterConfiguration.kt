package de.evoila.cf.writer.configuration


import de.evoila.cf.elasticsearch.writer.beans.ElasticsearchPropertiesBean
import de.evoila.cf.elasticsearch.writer.beans.GrokPatternBean
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@EnableConfigurationProperties(ElasticsearchPropertiesBean::class, GrokPatternBean::class)
open class WriterConfiguration {
}
