object SQRT {
	def sqrtStream(x: Double): Stream[Double] = {
		def improve(guess: Double) = (guess + x / guess) / 2
		lazy val guesses: Stream[Double] = 1 #:: (guesses map improve)
		guesses
	}

	sqrtStream(2).take(10).toList

}