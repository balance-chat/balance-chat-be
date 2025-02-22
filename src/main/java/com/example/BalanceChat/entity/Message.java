package com.example.BalanceChat.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@Entity
@Table(name = "messages")
@Getter @Setter
@NoArgsConstructor
public class Message {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long messageId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "room_id")
	private Room room;

	@Column(columnDefinition = "LONGTEXT")
	private String content;

	@Column(nullable = false)
	private LocalDateTime createdAt;

	@Column(length = 1)
	private String choiceContext;
}
