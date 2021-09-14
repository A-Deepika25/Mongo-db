package com.example.Mongodb;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
		private long id;
		private String name;
		private int age;
		private int num;
	}


