/**
 * 
 */
package com.huawei.traveller.config;

import java.util.Arrays;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.interceptor.CacheErrorHandler;
import org.springframework.cache.interceptor.CacheResolver;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.cache.interceptor.SimpleKeyGenerator;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Administrator
 * 需要重定义哪些属性，请搜索CachingConfigurer的定义
 */
@Configuration
@EnableCaching
public class CacheConfig implements CachingConfigurer {
	@Bean
	@Override
	public CacheManager cacheManager() {
		SimpleCacheManager cacheManager = new SimpleCacheManager();

		//List<Cache> caches = new ArrayList<Cache>();
		//caches.add(new ConcurrentMapCache("myCacheName"));
		//cacheManager.setCaches(caches);
		cacheManager.setCaches(Arrays.asList(
				new ConcurrentMapCache("scenceCache"),
				new ConcurrentMapCache("userCache")));

		return cacheManager;
	}

	@Bean
	@Override
	public KeyGenerator keyGenerator() {
		return new SimpleKeyGenerator();
	}

	@Override
	public CacheResolver cacheResolver() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CacheErrorHandler errorHandler() {
		// TODO Auto-generated method stub
		return null;
	}


}
