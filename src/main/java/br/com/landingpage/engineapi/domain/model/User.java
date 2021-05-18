package br.com.landingpage.engineapi.domain.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Builder
@Data
@Entity
@Table(name = "USER")
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@EqualsAndHashCode
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "VC_ID_SERVER")
    private Long server;

    @Column(name = "VC_EMAIL")
    private String email;

    @Column(name = "VC_NAME")
    private String name;

    @Column(name = "VC_PHONE")
    private String phone;

    @Column(name = "VC_COMPANY")
    private String company;

    @Column(name = "DATE_CREATION")
    private LocalDateTime dateCreation;

}
