package com.personal.skyAngel.utils;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;

/**
 * Http相关工具类
 */
public class HttpUtils {

    private static final Logger logger = LoggerFactory.getLogger(HttpUtils.class);

    private static SimpleClientHttpRequestFactory requestFactory = null;
    static {
        requestFactory = new SimpleClientHttpRequestFactory();
        requestFactory.setConnectTimeout(60000); // 连接超时时间(ms)
        requestFactory.setReadTimeout(60000); // 读取超时时间(ms)
    }

    private static RestTemplate restTemplate = new RestTemplate(requestFactory);

    public static JsonNode postForJsonNode(String url, Map<String, Object> map) {
        return postForObject(url, map, JsonNode.class);
    }

    public static <T> T postForObject(String url, Map<String, Object> map, Class<T> responseType) {
        logger.debug("POST， url={}，map={}", url, map);
        return restTemplate.postForObject(url, map, responseType);
    }

}
