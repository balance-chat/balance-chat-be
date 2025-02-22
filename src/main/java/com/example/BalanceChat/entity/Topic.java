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
@Table(name = "topics")
@Getter @Setter
@NoArgsConstructor
public class Topic {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long topicId;

	@Column(nullable = false)
	private String optionA;

	@Column(nullable = false)
	private String optionB;

	@Column(nullable = false)
	private LocalDateTime createdAt;

	@Column(nullable = false)
	private LocalDateTime expiresAt;

	private boolean isActive;

	@OneToMany(mappedBy = "topic")
	private List<Room> rooms = new ArrayList<>();
}
