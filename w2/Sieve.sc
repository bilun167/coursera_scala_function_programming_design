object Seive {
	def prime(s: Stream[Int]): Stream[Int] = {
		s.head #:: prime(s filter (_ % s.head != 0))
	}

	def from(n: Int): Stream[Int] = {
		n #:: from(n + 1)
	}

	prime(from(2)).take(100).toList
}