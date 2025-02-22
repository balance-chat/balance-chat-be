package com.example.BalanceChat.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@Getter @Setter
@NoArgsConstructor
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;

	@Column(nullable = false)
	private String password;

	@Column(nullable = false)
	private String nickname;

	@Column(nullable = false)
	private String email;

	@OneToMany(mappedBy = "user")
	private List<Message> messages = new ArrayList<>();

	@OneToMany(mappedBy = "user")
	private List<UserParticipation> participations = new ArrayList<>();
}
