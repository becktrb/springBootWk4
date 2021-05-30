package com.promineotech.jeep.entity;

import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;

import org.hibernate.validator.constraints.Length;

import lombok.Data;

@Data
public class OrderRequest {

@Length(max = 30)
@Pattern(regexp = "[\\w\\s]*")
  private String customer;


  private JeepModel model;


@Length(max = 30)
@Pattern(regexp = "[\\w\\s]*")
  private String trim;



@Max(4)
  private int doors;


@Length(max = 30)
@Pattern(regexp = "[\\w\\s]*")
  private String color;


@Length(max = 30)
@Pattern(regexp = "[\\w\\s]*")
  private String engine;


@Length(max = 30)
@Pattern(regexp = "[\\w\\s]*")
  private String tire;


  private List<@NotNull @Length(max = 30) @Pattern(
		  regexp = "[A-Z0-9_]*") String> options;
}
