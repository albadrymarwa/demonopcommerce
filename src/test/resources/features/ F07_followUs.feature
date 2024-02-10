@smoke


  Feature: User could open followUs links

    Scenario: User opens facebook link
      Given User is on homepage
      When user opens facebook link
      Then facebook Page is opend in a new tab

      Scenario: User opens twitter link
        Given User is on homepage
        When user opens twitter link
        Then twitter Page is opend in a new tab

        Scenario: User open rss link
          Given User is on homepage
          When user opens rss  link
          Then rss Page is opend in a new tab

    Scenario: User open youtube link
      Given User is on homepage
      When user opens yputube  link
      Then youtube Page is opend in a new tab