package com.quanlydiemthi.backend.Config;

import org.modelmapper.AbstractConverter;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

    @Bean
    public ModelMapper modelMapperConvert() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.addConverter(new StringToBooleanConverter());
        return modelMapper;
    }

    private static class StringToBooleanConverter extends AbstractConverter<String, Boolean> {
        @Override
        protected Boolean convert(String source) {
            // Thực hiện chuyển đổi từ chuỗi thành boolean
            // Ví dụ:
            // "true" hoặc "TRUE" -> true
            // "false" hoặc "FALSE" -> false
            return Boolean.parseBoolean(source);
        }
    }
}

