package com.example.BalanceChat.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@Entity
@Table(name = "user_participation")
@Getter @Setter
@NoArgsConstructor
public class UserParticipation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long participationId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "room_id")
	private Room room;

	@Column(length = 1, nullable = false)
	private String currentChoice;

	@Column(length = 1, nullable = false)
	private String initialChoice;

	@Column(nullable = false)
	private LocalDateTime joinedAt;

	private LocalDateTime choiceChangedAt;
}
