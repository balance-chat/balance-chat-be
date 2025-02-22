package com.example.BalanceChat.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "rooms")
@Getter @Setter
@NoArgsConstructor
public class Room {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long roomId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "topic_id")
	private Topic topic;

	@OneToMany(mappedBy = "room")
	private List<Message> messages = new ArrayList<>();

	@OneToMany(mappedBy = "room")
	private List<UserParticipation> participations = new ArrayList<>();
}
